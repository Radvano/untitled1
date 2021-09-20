package com.company.models;

public class PizzaMenuItem {
    private String jmeno;
    private int cena;
    private String popis;

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public String getPopis() {
        return popis;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getCena() {
        return cena;
    }
}
