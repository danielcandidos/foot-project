/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import bean.Jogador;
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
    ArrayList<String> lista_jog = new ArrayList<String>();
    ArrayList<String> lista_dados_jogs = new ArrayList<String>();
    
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
    
    public ArrayList<String> buscarJogador(String nome) throws Exception{
        String b = nome;
        this.query = "select * from jogador where nome = ?";
        PreparedStatement stmt1 = con.prepareStatement(query);                
        stmt1.setString(1,b);                
        ResultSet rs1;
        rs1 = stmt1.executeQuery(); 

           while(rs1.next()) {
            lista_dados_jogs.add(rs1.getString(2));                
            lista_dados_jogs.add(rs1.getString(3));                
            lista_dados_jogs.add(rs1.getString(4));                
            lista_dados_jogs.add(rs1.getString(5));                
            lista_dados_jogs.add(rs1.getString(6));                
            lista_dados_jogs.add(rs1.getString(7));                
            lista_dados_jogs.add(rs1.getString(8));                
            lista_dados_jogs.add(rs1.getString(9));
            lista_dados_jogs.add(rs1.getString(10));
        }      
        System.out.println(lista_dados_jogs);
        return lista_dados_jogs;
       
    }
    
    public ArrayList<String> buscaNomes() throws Exception {
        this.conectarBanco();
        this.query = "select nome from jogador";
        PreparedStatement stmt1 = con.prepareStatement(query);
        ResultSet rs1 = stmt1.executeQuery();
        while (rs1.next()){
            lista_jog.add(rs1.getString(1));                 
        }
        System.out.println(lista_jog);
        this.desconectarBanco();
        return lista_jog;       
    }
    
    public String[][] getStats1(Filtro filtro, Jogador jogador)throws Exception {
        this.conectarBanco();
        String campeonato=filtro.getCampeonato();
        String ano = filtro.getTemporada();
        String clube = filtro.getClube();
        String jog = jogador.getNome();
        this.query = "select * from "+campeonato+"_"+ano+" where Nome = "+jogador+" and Clube = "+clube+" " ;
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
        
        desconectaDB();
        
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
        String ano = filtro.getTemporada();
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
        
        desconectaDB();
        
        String[][] Matrix = new String[3][datas.size()];
        int tamanho = datas.size();
        for (int i = 0; i<tamanho; i++){
            Matrix[0][i] = datas.get(i)+"";
            Matrix[1][i] = pessoas.get(i)+"";
            Matrix[2][i] = valores.get(i)+"";
        }
        return Matrix;
    }
}

