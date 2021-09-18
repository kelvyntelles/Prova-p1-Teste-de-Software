package com.Prova;

public class Locacao {

    Cliente cliente;
    DVD dvd;
    private int numDiasLocacao;

    public Locacao(Cliente cliente, DVD dvd, int numDiasLocacao) {
        this.cliente = cliente;
        this.dvd = dvd;
        this.numDiasLocacao = numDiasLocacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public DVD getDvd() {
        return dvd;
    }

    public void setDvd(DVD dvd) {
        this.dvd = dvd;
    }

    public String getNomeDVD() {
        return this.dvd.getNome();
    }

    public String getNomeCliente() {
        return cliente.getNome();
    }

    public float calculaValorTotalLocacao() {
        float valorTotal = this.dvd.getValor() * this.numDiasLocacao;
        return valorTotal;
    }
}
