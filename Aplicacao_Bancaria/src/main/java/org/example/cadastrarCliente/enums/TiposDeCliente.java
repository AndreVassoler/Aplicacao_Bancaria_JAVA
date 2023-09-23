package org.example.cadastrarCliente.enums;

public enum TiposDeCliente {
    PESSOA("pessoa"),
    SOLTEIRO("solteiro"),
    CASADO("casado"),
    EMPRESA("empresa"),
    UNICO("unico"),
    SOCIO("socio");


    private String tipoDeCliente;

    TiposDeCliente(String tipoDeCliente) {
        this.tipoDeCliente = tipoDeCliente;
    }


}
