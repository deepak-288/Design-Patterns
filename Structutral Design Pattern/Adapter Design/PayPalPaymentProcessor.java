// PayPalPaymentProcessor.java
public class PayPalPaymentProcessor implements PayPalProcessor {
    @Override
    public void sendPayPalPayment(double amount) {
        System.out.println("Sending PayPal payment of $" + amount);
    }
}
