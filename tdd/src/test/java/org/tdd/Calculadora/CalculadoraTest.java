package org.tdd.Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void deveRetornarSoma() {
        int valor1 = 4;
        int valor2 = 4;
        assertEquals(8, calculadora.realizarSoma(4, 4));
    }

    @Test
    void deveRetornarSubtracao() {
        int valor1 = 5;
        int valor2 = 3;
        assertEquals(2, calculadora.realizarSubtracao(5, 3));
    }

    @Test
    void deveRetornarMultiplicacao() {
        int valor1 = 4;
        int valor2 = 4;
        assertEquals(16, calculadora.realizarMultiplicacao(4, 4));
    }

    @Test
    void deveRetornarDivisao() {
        int valor1 = 10;
        int valor2 = 2;
        assertEquals(5, calculadora.realizarDivisao(10, 2));
    }

}