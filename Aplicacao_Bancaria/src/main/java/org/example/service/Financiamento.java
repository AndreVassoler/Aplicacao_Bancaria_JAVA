package org.example.service;

public class Financiamento {

    private final Double valorDoFinanciamento;
    private final Double valorTotalDoFinanciamento;
    private final Double valorRestanteAPagar;
    private final Double taxaDeJuros;
    private final String numFinanciamento;
    private final Integer quantidadeDeParcelas;
    private final Integer quantidadeDeParcelasPagas;
    private final Double valorDaParcela;
    private final Double valorTotalDosJuros;
    private final Double valorTotalPago;


    public Financiamento(Double valorDoFinanciamento, Double valorTotalDoFinanciamento, Double valorRestanteAPagar, Double taxaDeJuros, String numFinanciamento, Integer quantidadeDeParcelas, Integer quantidadeDeParcelasPagas, Double valorDaParcela, Double valorTotalDosJuros, Double valorTotalPago) {
        this.valorDoFinanciamento = valorDoFinanciamento;
        this.valorTotalDoFinanciamento = valorTotalDoFinanciamento;
        this.valorRestanteAPagar = valorRestanteAPagar;
        this.taxaDeJuros = taxaDeJuros;
        this.numFinanciamento = numFinanciamento;
        this.quantidadeDeParcelas = quantidadeDeParcelas;
        this.quantidadeDeParcelasPagas = quantidadeDeParcelasPagas;
        this.valorDaParcela = valorDaParcela;
        this.valorTotalDosJuros = valorTotalDosJuros;
        this.valorTotalPago = valorTotalPago;
    }


    public Double getValorDoFinanciamento() {
        return valorDoFinanciamento;
    }

    public Double getValorTotalDoFinanciamento() {
        return valorTotalDoFinanciamento;
    }

    public Double getValorRestanteAPagar() {
        return valorRestanteAPagar;
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public String getNumFinanciamento() {
        return numFinanciamento;
    }

    public Integer getQuantidadeDeParcelas() {
        return quantidadeDeParcelas;
    }

    public Integer getQuantidadeDeParcelasPagas() {
        return quantidadeDeParcelasPagas;
    }

    public Double getValorDaParcela() {
        return valorDaParcela;
    }

    public Double getValorTotalDosJuros() {
        return valorTotalDosJuros;
    }

    public Double getValorTotalPago() {
        return valorTotalPago;
    }
}
