/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Daniel
 */
public class Filtro {
    private int temp1;
    private int temp2;
    private String clube = "todos";
    private String campeonato = "brasileirao";    
    
    public Filtro(int t1, int t2){
        this.temp1 = t1;
        this.temp2 = t2;
    }
    /**
     * @return the temporada
     */
    public int getTemporada1() {
        return temp1;
    }
    /**
     * @param temporada the temporada to set
     */
    public void setTemporada1(int temporada) {
        this.temp1 = temporada;
    }
    /**
     * @return the temporada
     */
    public int getTemporada2() {
        return temp2;
    }
    /**
     * @param temporada the temporada to set
     */
    public void setTemporada2(int temporada) {
        this.temp2 = temporada;
    }
    /**
     * @return the clube
     */
    public String getClube() {
        return clube;
    }
    /**
     * @param clube the clube to set
     */
    public void setClube(String clube) {
        this.clube = clube;
    }
    /**
     * @return the campeonato
     */
    public String getCampeonato() {
        return campeonato;
    }

    /**
     * @param campeonato the campeonato to set
     */
    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }
    
}
