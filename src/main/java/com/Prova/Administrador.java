package com.Prova;

public class Administrador extends Usuario {

    DVD dvd;

    public Administrador(String nome, DVD dvd) {
        super(nome);
        this.dvd = dvd;
    }

    public DVD getDvd() {
        return dvd;
    }

    public void setDvd(DVD dvd) {
        this.dvd = dvd;
    }

    public void setValorDVD(float novoValor) {
        this.dvd.valor = novoValor;
    }

    public float getValorDVD() {
        return dvd.getValor();
    }
}
