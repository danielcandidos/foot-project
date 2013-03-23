/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import negocio.ControleBanco;

/**
 *
 * @author Daniel
 */
public class Teste {
    public static void main(String[] args) throws Exception {
        //String nome = "daniel candido";
        //String[] novo =nome.split(" ");
        //String b = "";
        ControleBanco banco = new ControleBanco();
        banco.busca_nomes();
        //for (String a:novo){
        //    b+=a;
        //}
        
        //System.out.println(b);
    }
}
