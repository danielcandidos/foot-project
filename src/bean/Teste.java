/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.ControleBanco;
import negocio.Filtro;
import visao.JFPesquisa;

/**
 *
 * @author Daniel
 */
public class Teste {
    public static void main(String[] args) throws Exception {
        String nome = "daniel candido";
        //String[] novo =nome.split(" ");
        //String b = "";
        try{
            ControleBanco banco = new ControleBanco();
            //filtro.setTemporada1(2011);
            //filtro.setTemporada2(2013);
            //banco.buscaTemporada("Neymar", 2012);
        } catch (Exception ex) {
            Logger.getLogger(JFPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        }
        //for (String a:novo){
        //    b+=a;
        //}
        //System.out.println(b);
        //Goleiro goleiro = new Goleiro(nome);
    }
}
