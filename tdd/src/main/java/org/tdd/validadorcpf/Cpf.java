package org.tdd.validadorcpf;

public class Cpf {

    public boolean validarCpf(String valorCpf) {

        if (valorCpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        if (!valorCpf.matches("\\d{11}")) {
            return false;
        }

        if (valorCpf.length() != 11) {
            return false;
        }

        return true;
    }

}
