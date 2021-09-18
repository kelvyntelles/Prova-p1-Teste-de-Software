package com.Prova;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;

import static org.junit.jupiter.api.Assertions.*;

class DVDTest {

    @Test
    void deveRetornarNomeDiretor() {
        Diretor diretor = new Diretor("Telles");
        Genero genero = new Genero("Livre para todos os públicos");
        DVD dvd = new DVD(diretor, genero, "Filme", 10.0f);
        dvd.getNomeDiretor();

        assertEquals("Telles", dvd.getNomeDiretor());
    }

    @Test
    void deveRetornarExcecaoConstrutorNomeFilmeVazio() {
        try {
            Diretor diretor = new Diretor("Telles");
            Genero genero = new Genero("Livre para todos os públicos");
            DVD dvd = new DVD(diretor, genero, "", 10.0f);
            dvd.getNome();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExecaoConstrutorNomeFilmeNulo() {
        try {
            Diretor diretor = new Diretor("Telles");
            Genero genero = new Genero("Livre para todos os públicos");
            DVD dvd = new DVD(diretor, genero, null, 10.0f);
            dvd.getNome();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetNomeFilmeVazio() {
        try {
            Diretor diretor = new Diretor("Telles");
            Genero genero = new Genero("Livre para todos os públicos");
            DVD dvd = new DVD(diretor, genero, "Kelvyn", 10.0f);
            dvd.setNome("");
            dvd.getNome();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetNomeFilmeNulo() {
        try {
            Diretor diretor = new Diretor("Telles");
            Genero genero = new Genero("Livre para todos os públicos");
            DVD dvd = new DVD(diretor, genero, "Kelvyn", 10.0f);
            dvd.setNome(null);
            dvd.getNome();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetValorFilmeMenorZero() {
        try {
            Diretor diretor = new Diretor("Telles");
            Genero genero = new Genero("Livre para todos os públicos");
            DVD dvd = new DVD(diretor, genero, "Kelvyn", 10.0f);
            dvd.setValor(0);
            dvd.getValor();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("O preço tem que ser maior que 0", e.getMessage());
        }
    }
}