public class PaymentService {
    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
    void paymentProcessor(double amount){
        paymentProcessor.pay(amount);
    }
}
