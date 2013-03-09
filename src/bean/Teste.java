/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Daniel
 */
public class Teste {
    public static void main(String[] args) {
        String nome = "daniel candido";
        String[] novo =nome.split(" ");
        String b = "";
        
        for (String a:novo){
            b+=a;
        }
        
        System.out.println(b);
    }
}
