package org.example.service;

import org.example.service.enums.TipoDaTransacao;

public class Transacao {

    public int numTransacao;
    private final Double valorDaTransacao;
    private final TipoDaTransacao tipoDaTransacao;
    private final String dataDaTransicao;


    public Transacao(int numTransacao, Double valorDaTransacao, TipoDaTransacao tipoDaTransicao, String dataDaTransicao) {
        this.numTransacao = numTransacao;
        this.valorDaTransacao = valorDaTransacao;
        this.tipoDaTransacao = tipoDaTransicao;
        this.dataDaTransicao = dataDaTransicao;
    }

    public int getNumTransacao() {
        return numTransacao;
    }

    public Double getValorDaTransacao() {
        return valorDaTransacao;
    }

    public TipoDaTransacao getTipoDaTransicao() {
        return tipoDaTransacao;
    }

    public String getDataDaTransicao() {
        return dataDaTransicao;
    }
}
