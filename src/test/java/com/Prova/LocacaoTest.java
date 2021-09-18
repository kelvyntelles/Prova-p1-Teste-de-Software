package com.Prova;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;

import static org.junit.jupiter.api.Assertions.*;

class LocacaoTest {

    @Test
    void deveRetornarNomeClienteLocacao() {
        Diretor diretor = new Diretor("Telles");
        Genero genero = new Genero("Livre para todos os públicos");
        DVD dvd = new DVD(diretor, genero, "Kelvyn", 10.0f);
        Cliente cliente = new Cliente("Kelvyn");
        Locacao locacao = new Locacao(cliente, dvd, 2);
        locacao.getNomeCliente();

        assertEquals("Kelvyn", locacao.getNomeCliente());
    }

    @Test
    void deveRetornarNomeDVDLocacao() {
        Diretor diretor = new Diretor("Telles");
        Genero genero = new Genero("Livre para todos os públicos");
        DVD dvd = new DVD(diretor, genero, "Filme", 10.0f);
        Cliente cliente = new Cliente("Kelvyn");
        Locacao locacao = new Locacao(cliente, dvd, 2);
        locacao.getNomeDVD();

        assertEquals("Filme", locacao.getNomeDVD());
    }

    @Test
    void deveCalcularValorTotalLocacao() {
        Diretor diretor = new Diretor("Telles");
        Genero genero = new Genero("Livre para todos os públicos");
        DVD dvd = new DVD(diretor, genero, "Filme", 10.0f);
        Cliente cliente = new Cliente("Kelvyn");
        Locacao locacao = new Locacao(cliente, dvd, 2);
        locacao.calculaValorTotalLocacao();

        assertEquals(20.0f, locacao.calculaValorTotalLocacao());
    }
}