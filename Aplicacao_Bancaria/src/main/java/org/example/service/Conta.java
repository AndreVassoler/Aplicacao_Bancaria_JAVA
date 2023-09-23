package org.example.service;

import org.example.cadastrarCliente.Cliente;
import org.example.service.enums.TipoConta;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private String numAgencia;
    private String numConta;
    private TipoConta tipoConta;
    private Boolean contaConjunta;
    private Double saldo;
    private List<Cliente> titulares = new ArrayList<>();
    private List<Transacao> transacao = new ArrayList<>();
    private List<Financiamento> financiamentos = new ArrayList<>();



public Conta(String numAgencia, String numConta, Double saldo, TipoConta tipoConta, Boolean contaConjunta, List<Cliente> titulares) {
    this.numAgencia = numAgencia;
    this.numConta = numConta;
    this.saldo = saldo;
    this.tipoConta = tipoConta;
    this.contaConjunta = contaConjunta;
    this.titulares = titulares;
}

public String getNumAgencia() {
    return numAgencia;
}

public String getNumConta() {
    return numConta;
}

public Double getSaldo() {
    return saldo;
}

public TipoConta getTipoConta() {
    return tipoConta;
}

public Boolean getContaConjunta() {
    return contaConjunta;
}

public List<Cliente> getTitulares() {
    return titulares;
}

public List<Transacao> getTransacao() {
    return transacao;
}

    public List<Transacao> getTransacaoData(String dataDeTransacao) {
        List<Transacao> transacaoData = new ArrayList<>();

        for (Transacao transacao : this.transacao) {
            if (transacao.getDataDaTransicao().equals(dataDeTransacao)) {
                transacaoData.add(transacao);
            }
        }

        return transacaoData;
    }

    public List<Financiamento> getFinanciamentos() {
        return financiamentos;
    }

    public Financiamento getFinanciamentoPeloNumero(String numFinanciamento) {
        for (Financiamento financiamento : this.financiamentos) {
            if (financiamento.getNumFinanciamento().equals(numFinanciamento)) {
                return financiamento;
            }
        }
        return null;
    }

    public void setAgencia(String numAgencia) {
        this.numAgencia = numAgencia;
    }

    public void setNumeroConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setContaConjunta(Boolean contaConjunta) {
        this.contaConjunta = contaConjunta;
    }

    public void setTitulares(List<Cliente> titulares) {
        this.titulares = titulares;
    }

    public void setTransacoes(List<Transacao> transacao) {
        this.transacao = transacao;
    }

    public void setFinanciamentos(List<Financiamento> financiamentos) {
        this.financiamentos = financiamentos;
    }
}


