package org.example.cadastrarCliente;

import org.example.cadastrarCliente.enums.TiposDeCliente;

public class ClientePessoa extends Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String dataNasci;
    private TiposDeCliente tiposDeCliente;
    private String cpfConjuge;


    public ClientePessoa(String nome, String email, String telefone, Endereco endereco, String nome1, String sobrenome, String cpf, String dataNasci, TiposDeCliente tiposDeCliente, String cpfConjuge) {
        super(nome, email, telefone, endereco);
        this.nome = nome1;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataNasci = dataNasci;
        this.tiposDeCliente = tiposDeCliente;
        this.cpfConjuge = cpfConjuge;
    }

    @Override
    public String getRazaoSocila() {
        return null;
    }

    @Override
    public String getNomeOuNomeFantasia() {
        return nome;
    }

    @Override
    public String getNomeCompeltoOuRazaoSocial() {
        return nome + " " + sobrenome;
    }

    @Override
    public String getCpfOuCnpj() {
        return cpf;
    }

    @Override
    public String getDataNascimentoOuDataAbertura() {
        return dataNasci;
    }

    @Override
    public TiposDeCliente getEstadoCivilOuTipoSociedade() {
        return tiposDeCliente;
    }

    @Override
    public String getCpfConjugeOuCnpjSocio() {
        return cpfConjuge;
    }
}
