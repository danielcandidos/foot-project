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
    private String temporada = "todos";
    private String clube = "todos";
    private String campeonato = "brasileirao";    

    /**
     * @return the temporada
     */
    public String getTemporada() {
        return temporada;
    }
    /**
     * @param temporada the temporada to set
     */
    public void setTemporada(String temporada) {
        this.temporada = temporada;
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
