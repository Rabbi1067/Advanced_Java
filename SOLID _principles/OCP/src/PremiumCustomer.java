public class PremiumCustomer implements Customer{

    @Override
    public double getDiscount(double amount) {
        return amount* 0.01;
    }
}
