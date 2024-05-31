// PayPalPaymentAdapter.java
public class PayPalPaymentAdapter implements Payment {
    private final PayPalProcessor processor;

    public PayPalPaymentAdapter(PayPalProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void pay(double amount) {
        processor.sendPayPalPayment(amount);
    }
}
