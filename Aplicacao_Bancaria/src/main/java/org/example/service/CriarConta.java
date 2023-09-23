package org.example.service;

import org.example.cadastrarCliente.Cliente;
import org.example.service.enums.CriarContaPessoa;
import org.example.service.enums.TipoConta;

import java.util.List;

public class CriarConta extends Conta {

    public CriarConta(String numAgencia, String numConta, Double saldo, TipoConta tipoConta, Boolean contaConjunta, List<Cliente> titulares) {
        super(numAgencia, numConta, saldo, tipoConta, contaConjunta, titulares);
    }

    public Conta abrirContaPessoa(List<Cliente> titulares, TipoConta tipoConta, Double saldoInicial) {
        if (saldoInicial < 0) throw new RuntimeException("O saldo não pode ser negativo");

        try {
            String agencia = "7392";
            String numeroConta = CriarContaPessoa.CriarContaPessoa();

            if (tipoConta == TipoConta.POUPANCA && saldoInicial < tipoConta.getValorMinimoDeAbertura()) {
                throw new RuntimeException("Saldo insuficiente para abrir uma conta poupança");
            }

            return new Conta(agencia, numeroConta, saldoInicial, tipoConta, false, titulares);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar conta");
        }
    }

    public Conta abrirContaConjunta(List<Cliente> titulares, TipoConta tipoConta, Double saldoInicial) {
        if (saldoInicial < 0) throw new RuntimeException("O saldo não pode ser negativo");

        if (titulares.size() != 2) throw new RuntimeException("É preciso ter duas pessoas para abrir uma conta conjunta");

        if (titulares.get(0).getCpfConjugeOuCnpjSocio() != titulares.get(1).getCpfOuCnpj()) throw new RuntimeException("CPF do segundo titular nao é igual com o CPF cadastrado no primeiro titular");

        try {
            String agencia = "7392";
            String conta = new String();

            if (tipoConta == TipoConta.POUPANCA && saldoInicial < tipoConta.getValorMinimoDeAbertura()) {
                throw new RuntimeException("Saldo inicial insuficiente para abrir uma conta poupança!");
            }

            return new Conta(agencia, conta, saldoInicial, tipoConta, true, titulares);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar conta conjunta");
        }
    }
}
