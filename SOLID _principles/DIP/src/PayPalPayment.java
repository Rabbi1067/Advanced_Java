public class PayPalPayment implements PaymentProcessor{
    @Override
    public void pay(double amount) {
        IO.println("Paid "+amount +" using paypal");
    }
}
