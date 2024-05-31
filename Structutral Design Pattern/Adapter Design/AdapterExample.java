// AdapterExample.java
public class AdapterExample {
    public static void main(String[] args) {
        // Using Credit Card Payment
        CreditCardProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        Payment creditCardAdapter = new CreditCardPaymentAdapter(creditCardProcessor);
        creditCardAdapter.pay(100.0);

        // Using PayPal Payment
        PayPalProcessor payPalProcessor = new PayPalPaymentProcessor();
        Payment payPalAdapter = new PayPalPaymentAdapter(payPalProcessor);
        payPalAdapter.pay(50.0);

        // Error handling with no payment method selected
        Payment emptyAdapter = new CreditCardPaymentAdapter(null);
        emptyAdapter.pay(0.0);
    }
}
