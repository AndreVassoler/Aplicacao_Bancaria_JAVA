package org.example.cadastrarCliente;

import org.example.cadastrarCliente.enums.TiposDeCliente;

public abstract class Cliente {

    private String nome;
    private Endereco endereco;
    private String telefone;
    private String email;

    public Cliente(String nome, String email, String telefone, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public abstract String getRazaoSocila();

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public abstract String getNomeOuNomeFantasia();

    public abstract String getNomeCompeltoOuRazaoSocial();

    public abstract String getCpfOuCnpj();

    public abstract String getDataNascimentoOuDataAbertura();

    public abstract TiposDeCliente getEstadoCivilOuTipoSociedade();

    public abstract String getCpfConjugeOuCnpjSocio();



}
