// CreditCardPaymentAdapter.java
public class CreditCardPaymentAdapter implements Payment {
    private final CreditCardProcessor processor;

    public CreditCardPaymentAdapter(CreditCardProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void pay(double amount) {
        processor.processCreditCard(amount);
    }
}
