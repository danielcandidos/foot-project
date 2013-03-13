/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author gustavopereira
 */
public class  ControleBanco{
    static Connection con;
    String query;
    
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
    
    public ArrayList buscarJogador(String nome) throws Exception{
        ArrayList<String> lista_jog = new ArrayList<String>();
        int cont=1;
        this.query = "select * from jogador where nome = ?";
        PreparedStatement stmt1 = con.prepareStatement(query);                
        stmt1.setString(1,nome);                
        ResultSet rs1;
        rs1 = stmt1.executeQuery(); 
        
        while (rs1.next()){
            lista_jog.add(rs1.getString(2));                
            lista_jog.add(rs1.getString(3));                
            lista_jog.add(rs1.getString(4));                
            lista_jog.add(rs1.getString(5));                
            lista_jog.add(rs1.getString(6));                
            lista_jog.add(rs1.getString(7));                
            lista_jog.add(rs1.getString(8));                
            lista_jog.add(rs1.getString(9));
        }      
        return lista_jog;
    }
}
