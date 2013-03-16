/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Jogador {
    private String nome, nomeComp, pePref, clubeAtual, clubeAnt, imagem, nacionalidade;


    private String dataNasc;
    private float altura, peso;
    private String[] estatisticas, premios;
    
    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeComp() {
        return nomeComp;
    }

    public String getPePref() {
        return pePref;
    }

    public String getClubeAtual() {
        return clubeAtual;
    }

    public String getClubeAnt() {
        return clubeAnt;
    }

    public String getImagem() {
        return imagem;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String[] getEstatisticas() {
        return estatisticas;
    }

    public String[] getPremios() {
        return premios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }

    public void setPePref(String pePref) {
        this.pePref = pePref;
    }

    public void setClubeAtual(String clubeAtual) {
        this.clubeAtual = clubeAtual;
    }

    public void setClubeAnt(String clubeAnt) {
        this.clubeAnt = clubeAnt;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setEstatisticas(String[] estatisticas) {
        this.estatisticas = estatisticas;
    }

    public void setPremios(String[] premios) {
        this.premios = premios;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    
}
