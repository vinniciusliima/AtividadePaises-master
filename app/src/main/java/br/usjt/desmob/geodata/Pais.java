package br.usjt.desmob.geodata;

import java.io.Serializable;
import java.util.ArrayList;
import java.text.Collator;

/**
 * Criado por Vinicius Lima RA:201313379
 */

public class Pais implements Serializable, Comparable {
    private String nome;
    private String codigo;
    private String capital;
    private String regiao;
    private String subRegiao;
    private String demonimo;
    private int populacao;
    private int area;
    private String bandeira;
    private double gini;
    private ArrayList<String> idiomas;
    private ArrayList<String> moedas;
    private ArrayList<String> dominios;
    private ArrayList<String> fusos;
    private ArrayList<String> fronteiras;
    private double latitude;
    private double longitude;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getSubRegiao() {
        return subRegiao;
    }

    public void setSubRegiao(String subRegiao) {
        this.subRegiao = subRegiao;
    }

    public String getDemonimo() {
        return demonimo;
    }

    public void setDemonimo(String demonimo) {
        this.demonimo = demonimo;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public double getGini() {
        return gini;
    }

    public void setGini(double gini) {
        this.gini = gini;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<String> getMoedas() {
        return moedas;
    }

    public void setMoedas(ArrayList<String> moedas) {
        this.moedas = moedas;
    }

    public ArrayList<String> getDominios() {
        return dominios;
    }

    public void setDominios(ArrayList<String> dominios) {
        this.dominios = dominios;
    }

    public ArrayList<String> getFusos() {
        return fusos;
    }

    public void setFusos(ArrayList<String> fusos) {
        this.fusos = fusos;
    }

    public ArrayList<String> getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(ArrayList<String> fronteiras) {
        this.fronteiras = fronteiras;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return  "Pais{" +
                "nome='" + nome + '\'' + "\n" +
                "codigo='" + codigo + '\'' + "\n" +
                "capital='" + capital + '\'' + "\n" +
                "regiao='" + regiao + '\'' + "\n" +
                "subRegiao='" + subRegiao + '\'' + "\n" +
                "demonimo='" + demonimo + '\'' + "\n" +
                "populacao=" + populacao + "\n" +
                "area=" + area + "\n" +
                "bandeira='" + bandeira + '\'' + "\n" +
                "gini=" + gini + "\n" +
                "idiomas=" + idiomas + "\n" +
                "moedas=" + moedas + "\n" +
                "dominios=" + dominios + "\n" +
                "fusos=" + fusos + "\n" +
                "fronteiras=" + fronteiras + "\n" +
                "latitude=" + latitude + "\n" +
                "longitude=" + longitude + "\n";
    }

    @Override
    public int compareTo(Object o) {
        if (o == null || o.getClass() != getClass()) {
            return 0;
        } else {
            Pais pais = (Pais) o;
            Collator c = Collator.getInstance();
            c.setStrength(Collator.PRIMARY);
            return c.compare(this.nome, pais.getNome());
        }
    }
}
