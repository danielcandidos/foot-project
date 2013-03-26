/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

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
 * @author danielCandido, raffaelVieira, raphaelAlves
 */
public class  ControleBanco{    
    static Connection con;
    String query;
    ArrayList listadeJogadores = new ArrayList();
    ArrayList listaDadosJog = new ArrayList();
    ArrayList listaStatsJogs = new ArrayList();
    
    //lista_jog.add("Neymar");
    
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
    
    public void executarBanco(String query)throws Exception{
        Statement exe = con.createStatement();
        exe.executeUpdate(query);
        exe.close();
    }
    
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
    
    public String[][] getStats1(Filtro filtro, Jogador jogador)throws Exception {
        this.conectarBanco();
        String campeonato=filtro.getCampeonato();
        //String ano = filtro.getTemporada();
        String clube = filtro.getClube();
        String jog = jogador.getNome();
        //this.query = "select * from "+campeonato+"_"+ano+" where Nome = "+jogador+" and Clube = "+clube+" " ;
        PreparedStatement exe = con.prepareStatement(query);
        ResultSet retorno = exe.executeQuery();
     
        ArrayList valores = new ArrayList();
        ArrayList datas = new ArrayList();
        ArrayList pessoas = new ArrayList();

        while (retorno.next()) {
           pessoas.add(retorno.getString(2));
           valores.add(retorno.getString(3));
           datas.add(retorno.getString(4));
        }
        
        this.desconectarBanco();
        
        String[][] Matrix = new String[3][datas.size()];
        int tamanho = datas.size();
        for (int i = 0; i<tamanho; i++){
            Matrix[0][i] = datas.get(i)+"";
            Matrix[1][i] = pessoas.get(i)+"";
            Matrix[2][i] = valores.get(i)+"";
        }
        return Matrix;
    }
    
   public String[][] getStats2(Filtro filtro, Jogador jogador, String paramentro)throws Exception {
        this.conectarBanco();
        String campeonato=filtro.getCampeonato();
        //tring ano = filtro.getTemporada();
        String clube = filtro.getClube();
        String jog = jogador.getNome();
        //this.query = "select * from "+campeonato+"_"+ano+" where "+paramentro+" = "+jogador+" " ;
        this.query = "select * from brasileirao_2012 where nome = "+jogador+" UNION sele";
        PreparedStatement exe = con.prepareStatement(query);
        ResultSet retorno = exe.executeQuery();
     
        ArrayList valores = new ArrayList();
        ArrayList datas = new ArrayList();
        ArrayList pessoas = new ArrayList();

        while (retorno.next()) {
           pessoas.add(retorno.getString(2));
           valores.add(retorno.getString(3));
           datas.add(retorno.getString(4));
        }
        
        this.desconectarBanco();
        
        String[][] Matrix = new String[3][datas.size()];
        int tamanho = datas.size();
        for (int i = 0; i<tamanho; i++){
            Matrix[0][i] = datas.get(i)+"";
            Matrix[1][i] = pessoas.get(i)+"";
            Matrix[2][i] = valores.get(i)+"";
        }
        return Matrix;
    }
   
    public Stats buscaTemporada (String nome, int temporada) throws Exception {
        Stats stats = new Stats(temporada);
        this.conectarBanco();
        this.query = "select * from brasileirao_"+temporada+" where Nome = '"+nome+"'";
        PreparedStatement stmt = con.prepareStatement(query);            
        ResultSet rs1 = stmt.executeQuery();
        while (rs1.next()) {
            stats.setClube(rs1.getString(3));
            stats.setPartidas(rs1.getInt(4));
            stats.setGols(rs1.getInt(5));
            stats.setAssist(rs1.getInt(6));
            stats.setCarAma(rs1.getInt(7));
            stats.setCarVer(rs1.getInt(8));
        }
        this.desconectarBanco();        
        return stats;
    }
    
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
    
    public Jogador teste(Filtro filtro, Jogador jogador) throws SQLException, Exception{
        this.conectarBanco();
        for (int temp = filtro.getTemporada1(); temp<=filtro.getTemporada2(); temp++) {
            this.query = "select * from brasileirao_"+temp+" where Nome = '"+jogador.getNome()+"'";             
            PreparedStatement stmt = con.prepareStatement(query);            
            ResultSet rs1 = stmt.executeQuery();
            
            if (jogador.getPosicao().equals("Goleiro")){
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
                jogador.addEstatisticas(statsGol);
                jogador.getEstatisticas();
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
            }            
            
        }
        this.desconectarBanco();
        return jogador;
    }
}

