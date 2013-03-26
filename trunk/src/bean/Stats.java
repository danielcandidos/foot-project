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
public class Stats {
    private String campeonato= "Brasileirão";
    private int ano, partidas, gols, finalizacoes, assistencias, carAma, carVer;
    private double mediaGols, mediaAssist;
    private String clube;
    public ArrayList listaGeral;
    
    public Stats(int ano){
        this.ano = ano;
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
    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }
    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    /**
     * @return the partidas
     */
    public int getPartidas() {
        return partidas;
    }
    /**
     * @param partidas the partidas to set
     */
    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }
    /**
     * @return the gols
     */
    public int getGols() {
        return gols;
    }
    /**
     * @param gols the gols to set
     */
    public void setGols(int gols) {
        this.gols = gols;
    }
    /**
     * @return the finalizacoes
     */
    public int getFinalizacoes() {
        return finalizacoes;
    }
    /**
     * @param finalizacoes the finalizacoes to set
     */
    public void setFinalizacoes(int finalizacoes) {
        this.finalizacoes = finalizacoes;
    }
    /**
     * @return the assist
     */
    public int getAssist() {
        return assistencias;
    }
    /**
     * @param assist the assist to set
     */
    public void setAssist(int assist) {
        this.assistencias = assist;
    }
    /**
     * @return the carAma
     */
    public int getCarAma() {
        return carAma;
    }
    /**
     * @param carAma the carAma to set
     */
    public void setCarAma(int carAma) {
        this.carAma = carAma;
    }
    /**
     * @return the carVer
     */
    public int getCarVer() {
        return carVer;
    }
    /**
     * @param carVer the carVer to set
     */
    public void setCarVer(int carVer) {
        this.carVer = carVer;
    }
    /**
     * @return the mediaGols
     */
    public double getMediaGols() {
        return mediaGols;
    }
    /**
     * @return the mediaAssist
     */
    public double getMediaAssist() {
        return mediaAssist;
    }
    /**
     * @param mediaAssist the mediaAssist to set
     */
    public void gerarMedias() {
        this.mediaGols = (Double.parseDouble(this.gols+"")/Double.parseDouble(this.partidas+""));
        this.mediaAssist = (Double.parseDouble(this.assistencias+"")/Double.parseDouble(this.partidas+""));
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
    public ArrayList getStats (){
        ArrayList novaLista = new ArrayList();
        novaLista.add(this.ano);
        novaLista.add(this.clube);
        novaLista.add(this.partidas);
        novaLista.add(this.gols);
        novaLista.add(this.mediaGols);
        novaLista.add(this.assistencias);
        novaLista.add(this.mediaAssist);
        novaLista.add(this.carAma);
        novaLista.add(this.carVer);
        System.out.println(novaLista);
        return novaLista;
    }
}
