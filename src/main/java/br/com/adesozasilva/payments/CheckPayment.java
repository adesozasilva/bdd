package br.com.adesozasilva.payments;

class CheckPayment extends Payment {

    private final int limiteCheque = 450;

    CheckPayment(long contador, int valor) {
        this.id = contador;
        this.setValorPagamento(valor);
        executePayment(valor);
    }

    @Override
    public CheckPayment executePayment(int valor) {
        if (valor <= limiteCheque) {
            this.setStatusPagamento("Pagamento em Cheque processado com sucesso");
        }
        else {
            this.setStatusPagamento("Pagamento não autorizado");
        }
        return this;
    }
}