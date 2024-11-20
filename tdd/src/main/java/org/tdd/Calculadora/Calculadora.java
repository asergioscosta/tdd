package org.tdd.Calculadora;

public class Calculadora {

    public int realizarSoma(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public int realizarMultiplicacao(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public int realizarSubtracao(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public int realizarDivisao(int valor1, int valor2) {
        if (valor2 == 0) {
            return 0;
        }
        return valor1 / valor2;
    }
}
