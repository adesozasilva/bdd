package br.com.adesozasilva.payments;

class CardPayment extends Payment {

    private final int limit = 1000;

    CardPayment(long contador, int valor) {
        this.id = contador;
        this.setValorPagamento(valor);
        executePayment(valor);
    }

    @Override
    public CardPayment executePayment(int valor) {
        if (valor <= limit) {
            this.setStatusPagamento("Pagamento em Cartão processado com sucesso");
        }
        else {
            this.setStatusPagamento("Pagamento não autorizado");
        }
        return this;
    }
}