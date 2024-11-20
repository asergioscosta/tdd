package org.tdd.validadorcpf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CpfTest {

    private Cpf cpf;

    @BeforeEach
    public void setUp() {
        cpf = new Cpf();
    }

    @Test
    void deveRetornarTrueQuandoCpfValido() {
        String valorCpf = "58736958247";
        assertTrue(cpf.validarCpf(valorCpf));
    }

    @Test
    void deveRetornarFalseQuandoCpfInvalido() {
        String valorCpf = "123456789";
        assertFalse(cpf.validarCpf(valorCpf));
    }

    @Test
    void deveRetornarFalseQuandoCpfComCaracteresEspeciais() {
        String valorCpf = "123.456.789-00";
        assertFalse(cpf.validarCpf(valorCpf));
    }

    @Test
    void deveRetornarFalseQuandoCpfcomLetras() {
        String valorCpf = "123456789A8";
        assertFalse(cpf.validarCpf(valorCpf));
    }

    @Test
    void deveRetornarFalseQuandoCpfCaracteresEspeciaisNumerosRepetidos() {
        String valorCpf = "111.111.111-11";
        assertFalse(cpf.validarCpf(valorCpf));
    }

    @Test
    void deveRetornarFalseQuandoCpfNumerosRepetidos() {
        String valorCpf = "11111111111";
        assertFalse(cpf.validarCpf(valorCpf));
    }
}