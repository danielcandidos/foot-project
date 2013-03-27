/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import bean.Goleiro;
import bean.Jogador;
import bean.Stats;
import bean.StatsGol;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @footProject
 */
public class  ControleBanco{    
    static Connection con;
    String query;
    ArrayList listadeJogadores = new ArrayList();
    ArrayList listaDadosJog = new ArrayList();
    ArrayList listaStatsJogs = new ArrayList();
    Jogador jogador;
    ArrayList<Integer> arraylist;
    
    public void conectarBanco() throws ClassNotFoundException{ 
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/footleague";
        String login = "root";
        String password = "mysqlmysql";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,login,password);
            System.out.println("Conexao bem sucedida");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe falhou"+e.getMessage());
        } catch (SQLException e){
            System.out.println("Conexao falhou"+e.getMessage());
        }
    }
    
    public void desconectarBanco()throws Exception{
        con.close();
    }
    
    /*
     * Retorna o Jogador buscado com todos seus dados
     */
    public Jogador buscarJogador(String nome) throws Exception{
        Jogador jogador = new Jogador(nome);
        this.query = "select * from jogador where nome = ?";
        PreparedStatement stmt1 = con.prepareStatement(query);                
        stmt1.setString(1,nome);                
        ResultSet rs1;
        rs1 = stmt1.executeQuery();
        while(rs1.next()) {
            jogador.setNomeComp(rs1.getString(3));
            jogador.setDataNasc(rs1.getString(4));
            jogador.setAltura(rs1.getFloat(5));
            jogador.setPeso(rs1.getFloat(6));
            jogador.setClubeAnt(rs1.getString(7));
            jogador.setClubeAtual(rs1.getString(8));
            jogador.setNacionalidade(rs1.getString(9));
            jogador.setImagem(rs1.getString(10));
            jogador.setPosicao(rs1.getString(11));
        }          
        return jogador;       
    }
    
    /*
     * Retorna uma lista com os nomes de todos os jogadores
     */
    public ArrayList buscaListaJog() throws Exception {
        this.conectarBanco();
        this.query = "select nome from jogador";
        PreparedStatement stmt1 = con.prepareStatement(query);
        ResultSet rs1 = stmt1.executeQuery();
        while (rs1.next()){
            listadeJogadores.add(rs1.getString(1));                 
        }
        this.desconectarBanco();
        return listadeJogadores;       
    }    
    
    /*
     * Retorna uma lista com os nomes dos jogadores referentes a pesquisa parcial
     */
    public ArrayList buscaParcial (String nome) throws SQLException, Exception{
        this.conectarBanco();
        this.query = "select nome from jogador where nome like ?";
        PreparedStatement stmt = con.prepareStatement(query);            
        stmt.setString(1, "%"+nome+ "%");            
        ResultSet rs = stmt.executeQuery();        
        while (rs.next()){
            listadeJogadores.add(rs.getString(1));
        }
        this.desconectarBanco();        
        return listadeJogadores;
    }
    
    /*
     * Retorna o Jogador passado com todas suas estatísticas filtradras
     */
    public Jogador filtrarStats(Filtro filtro, Jogador jogador) throws SQLException, Exception{
        this.conectarBanco();        
        for (int temp = filtro.getTemporada1(); temp<=filtro.getTemporada2(); temp++) {
            this.query = "select * from brasileirao_"+temp+" where Nome = '"+jogador.getNome()+"'";             
            PreparedStatement stmt = con.prepareStatement(query);            
            ResultSet rs1 = stmt.executeQuery();
            
            if (jogador.getPosicao().equals("Goleiro")){
                Goleiro goleiro = (Goleiro) jogador;
                StatsGol statsGol = new StatsGol(temp);
                while (rs1.next()) {
                    statsGol.setClube(rs1.getString(3));
                    statsGol.setPartidas(rs1.getInt(4));
                    statsGol.setGols(rs1.getInt(5));
                    statsGol.setAssist(rs1.getInt(6));
                    statsGol.setCarAma(rs1.getInt(7));
                    statsGol.setCarVer(rs1.getInt(8));
                    statsGol.setGolsSofr(rs1.getInt(9));
                    statsGol.setDefesasDif(rs1.getInt(10));
                }
                statsGol.gerarMedias();
                System.out.println(statsGol.getStats());
                goleiro.addEstatisticas(statsGol);
                goleiro.getEstatisticas();
                this.jogador = goleiro;
            } else {
                Stats stats = new Stats(temp);
                while (rs1.next()) {
                    stats.setClube(rs1.getString(3));
                    stats.setPartidas(rs1.getInt(4));
                    stats.setGols(rs1.getInt(5));
                    stats.setAssist(rs1.getInt(6));
                    stats.setCarAma(rs1.getInt(7));
                    stats.setCarVer(rs1.getInt(8));
                }
                stats.gerarMedias();
                System.out.println(stats.getStats());
                jogador.addEstatisticas(stats);
                jogador.getEstatisticas();
                this.jogador = jogador;
            }        
        }
        return this.jogador;
    } 
}

