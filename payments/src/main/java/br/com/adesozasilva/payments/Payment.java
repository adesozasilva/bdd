package br.com.adesozasilva.payments;

public abstract class Payment implements PaymentFactory {

    protected long id;
    protected String paymentStatus;
    protected int paymentValue;

    @Override
    abstract public Payment executePayment(int valor);

    public static Payment factoryPagamento(long transactionId, PaymentType paymentType, int value) {
        switch (paymentType) {
        case CARD:
            return new CardPayment(transactionId, value); 
        case CHECK:
            return new CheckPayment(transactionId, value);
        case CASH: 
            return new CashPayment(transactionId, value);
        }
        return null;
    }

    public long getId() {
        return id;
    }

    public String getStatusPagamento() {
        return paymentStatus;
    }

    public int getValorPagamento() {
        return paymentValue;
    }

    public void setStatusPagamento(String s) {
        paymentStatus = s;
    }

    public void setValorPagamento(int valorPagamento) {
        this.paymentValue = valorPagamento;
    }


}