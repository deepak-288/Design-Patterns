// CreditCardPaymentProcessor.java
public class CreditCardPaymentProcessor implements CreditCardProcessor {
    @Override
    public void processCreditCard(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
