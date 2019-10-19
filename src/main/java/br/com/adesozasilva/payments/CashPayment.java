package br.com.adesozasilva.payments;

class CashPayment extends Payment {

    CashPayment(long contador, int valor) {
        this.id = contador;
        this.setValorPagamento(valor);
        executePayment(valor);
    }

    @Override
    public CashPayment executePayment(int valor) {
        this.setStatusPagamento("Pagamento em Dinheiro processado com sucesso");
        return this;
    }
}