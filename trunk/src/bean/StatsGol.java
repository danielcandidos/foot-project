/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;

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
    @Override
    public ArrayList getStats (){
        ArrayList novaLista = new ArrayList();
        novaLista.add(super.getAno());
        novaLista.add(super.getClube());
        novaLista.add(super.getPartidas());
        novaLista.add(super.getGols());
        novaLista.add(super.getMediaGols());
        novaLista.add(super.getAssist());
        novaLista.add(super.getMediaAssist());
        novaLista.add(super.getCarAma());
        novaLista.add(super.getCarVer());
        novaLista.add(this.golsSofr);
        novaLista.add(this.defesasDif);
        System.out.println(novaLista);
        return novaLista;
    }
}
