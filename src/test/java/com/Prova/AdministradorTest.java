package com.Prova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorTest {

    @Test
    void deveAlterarValorDVD() {
        Diretor diretor = new Diretor("Telles");
        Genero genero = new Genero("Livre para todos os públicos");
        DVD dvd = new DVD(diretor, genero, "Filme", 10.0f);
        Administrador administrador = new Administrador("Lopes", dvd);
        administrador.setValorDVD(15.0f);
        administrador.getValorDVD();

        assertEquals(15.0f, administrador.getValorDVD());
    }

}