package org.example.cadastrarCliente;

public class Endereco {

    private String nomRua;
    private int numCasa;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String nomRua, int numCasa, String bairro, String cidade, String estado, String cep) {
        this.nomRua = nomRua;
        this.numCasa = numCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
}
