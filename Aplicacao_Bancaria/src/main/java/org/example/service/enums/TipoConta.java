package org.example.service.enums;

public enum TipoConta {

    CORRENTE(0),
    POUPANCA(50),
    SALARIO(0);

    private Integer valorMinimoDeAbertura;

    TipoConta(Integer valorMinimoDeAbertura) {
        this.valorMinimoDeAbertura = valorMinimoDeAbertura;
    }

    public Integer getValorMinimoDeAbertura() {
        return valorMinimoDeAbertura;
    }



}

