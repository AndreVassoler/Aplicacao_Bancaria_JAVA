package org.example.service;

import org.example.cadastrarCliente.Cliente;
import org.example.cadastrarCliente.ClientePessoa;
import org.example.cadastrarCliente.Endereco;
import org.example.service.enums.TipoConta;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CriarContaTest {

    @Test
    public void testAbrirContaCorrentePessoaFisica() {

        CriarConta abrirConta = new CriarConta("7392", "123", 15000.0, TipoConta.CORRENTE, null, null);

        Endereco enderecoAndre = new Endereco("Rua 1", 123, "Norte", "Maringa", "PR", "86990000");

        ClientePessoa clienteAndre = new ClientePessoa("andre", "andre@gmail.com", "44988030409", enderecoAndre, "Andre", "Fragalli", "13098891980", "14/08/2004", null, null);

        List<Cliente> titularContaAndre = new ArrayList<>(Arrays.asList(clienteAndre));

        Conta contaAndre = abrirConta.abrirContaPessoa(titularContaAndre, TipoConta.CORRENTE, 15000.0);


        assertEquals("Andre Fragalli", contaAndre.getTitulares().get(0).getNomeCompeltoOuRazaoSocial());
        assertEquals(15000.0, contaAndre.getSaldo());
        assertEquals(TipoConta.CORRENTE, contaAndre.getTipoConta());

    }

    @Test
    public void testAbrirContaPoupancaPessoaFisica() {

        CriarConta abrirConta = new CriarConta("7392", "123", 50.0, TipoConta.POUPANCA, null, null);

        Endereco enderecoAndre = new Endereco("Rua 1", 123, "Norte", "Maringa", "PR", "86990000");

        ClientePessoa clienteAndre = new ClientePessoa("andre", "andre@gmail.com", "44988030409", enderecoAndre, "Andre", "Fragalli", "13098891980", "14/08/2004", null, null);

        List<Cliente> titularesContaAndre = new ArrayList<>(Arrays.asList(clienteAndre));

        Conta contaAndre = abrirConta.abrirContaPessoa(titularesContaAndre, TipoConta.POUPANCA, 50.0);

        assertEquals("Andre Fragalli", contaAndre.getTitulares().get(0).getNomeCompeltoOuRazaoSocial());
        assertEquals(50.0, contaAndre.getSaldo());
        assertEquals(TipoConta.POUPANCA, contaAndre.getTipoConta());



    }

    @Test
    public void testFinanciamento() {
        Financiamento financiamento = new Financiamento(15000.0,15000.0,10000.0,15.0,"7453",10,4,150.0,2200.0,5000.0);
        assertEquals(15000.0,15000.0);
    }

}