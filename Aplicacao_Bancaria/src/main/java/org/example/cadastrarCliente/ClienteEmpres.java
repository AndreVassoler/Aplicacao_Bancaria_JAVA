package org.example.cadastrarCliente;

import org.example.cadastrarCliente.enums.TiposDeCliente;

public class ClienteEmpres extends Cliente {

    private String razaoSocial;
    private String nome;
    private String cnpj;
    private String dateAbertura;
    private TiposDeCliente tiposDeCliente;
    private String cnpjConjuge;


    public ClienteEmpres(String nome, String email, String telefone, Endereco endereco, String razaoSocial, String nome1, String cnpj, String dateAbertura, TiposDeCliente tiposDeCliente, String cnpjConjuge) {
        super(nome, email, telefone, endereco);
        this.razaoSocial = razaoSocial;
        this.nome = nome1;
        this.cnpj = cnpj;
        this.dateAbertura = dateAbertura;
        this.tiposDeCliente = tiposDeCliente;
        this.cnpjConjuge = cnpjConjuge;
    }


    @Override
    public String getRazaoSocila() {
        return null;
    }

    @Override
    public String getNomeOuNomeFantasia() {
        return null;
    }

    @Override
    public String getNomeCompeltoOuRazaoSocial() {
        return null;
    }

    @Override
    public String getCpfOuCnpj() {
        return null;
    }

    @Override
    public String getDataNascimentoOuDataAbertura() {
        return null;
    }

    @Override
    public TiposDeCliente getEstadoCivilOuTipoSociedade() {
        return null;
    }

    @Override
    public String getCpfConjugeOuCnpjSocio() {
        return null;
    }
}
