package org.example.service.enums;

public enum TipoDaTransacao {

    SAQUE("saque"),
    DEPOSITO("deposito"),
    TRANSFERENCIA("transaferencia"),
    PAGAMENTO("pagamento");

    private String tipoAcao;

    TipoDaTransacao(String tipoAcao) {
        this.tipoAcao = tipoAcao;
    }

    public String getTipoAcao() {
        return tipoAcao;
    }

    public void setDescricao(String tipoAcao) {
        this.tipoAcao = tipoAcao;
    }

}
