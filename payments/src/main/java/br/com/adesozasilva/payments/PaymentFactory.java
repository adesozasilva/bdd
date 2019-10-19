package br.com.adesozasilva.payments;

public interface PaymentFactory {

    public enum PaymentType
    {
        CARD("CARD"),
        CHECK("CHECK"),
        CASH("CASH");
    
        private String type;
    
        PaymentType(String type) {
            this.type = type;
        }
    
        public String toString() {
            return type;
        }
    }

    abstract Payment executePayment(int valor);

}