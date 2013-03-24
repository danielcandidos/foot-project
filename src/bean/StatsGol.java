/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Daniel
 */
public class StatsGol extends Stats {
    private int golsSofr, defesasDif;
    
    public StatsGol(int ano){
        super(ano);
    }

    /**
     * @return the golsSofr
     */
    public int getGolsSofr() {
        return golsSofr;
    }

    /**
     * @param golsSofr the golsSofr to set
     */
    public void setGolsSofr(int golsSofr) {
        this.golsSofr = golsSofr;
    }

    /**
     * @return the defesasDif
     */
    public int getDefesasDif() {
        return defesasDif;
    }

    /**
     * @param defesasDif the defesasDif to set
     */
    public void setDefesasDif(int defesasDif) {
        this.defesasDif = defesasDif;
    }
}
