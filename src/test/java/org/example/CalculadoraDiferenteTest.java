package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculadoraDiferenteTest {

    @Test
    void inverteNumero() {
        CalculadoraDiferente calc = new CalculadoraDiferente();
        int resultado = calc.inverteNumero(12345); assertEquals(54321, resultado);

        resultado = calc.inverteNumero(1002); assertEquals(2001, resultado);
        

    }

    @Test
    void fatorial() {
        CalculadoraDiferente calc = new CalculadoraDiferente();

        int resultado = calc.fatorial(5);
        assertEquals(120,resultado);

        resultado = calc.fatorial(7);
        assertEquals(5040, resultado);
    }

    @Test
    void somaDobro() {
        CalculadoraDiferente calc = new CalculadoraDiferente();

        int resultado = calc.somaDobro(2, 3);
        assertEquals(8, resultado);

        // Teste com zero
        resultado = calc.somaDobro(0, 5);
        assertEquals(10, resultado);
    }
}