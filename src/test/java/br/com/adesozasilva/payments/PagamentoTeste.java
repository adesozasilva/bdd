package br.com.adesozasilva.payments;

public class PagamentoTeste {

    protected long id;
    protected String statusPagamento;
    protected int valorPagamento;

    public String getStatusPagamento() {
        return statusPagamento;
    }

    @Override
    public String toString() {
        return "PagamentoTeste{" +
                "id='" + id +
                ", statusPagamento=" + statusPagamento +
                ", valorPagamento=" + valorPagamento +
                '}';
    }
}