/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Daniel
 */
public class Goleiro extends Jogador{
    private String[] statsGerais;  
    /**
     *
     */
    public Goleiro (String nome){
        super(nome);
        super.setPosicao("Goleiro");
    }
    /**
     * @return the statsGerais
     */
    public String[] getStatsGerais() {
        return statsGerais;
    }
    /**
     * @param statsGerais the statsGerais to set
     */
    public void setStatsGerais(String[] statsGerais) {
        this.statsGerais = statsGerais;
    }
    
}
