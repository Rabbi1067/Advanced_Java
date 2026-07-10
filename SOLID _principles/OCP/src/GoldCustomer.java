public class GoldCustomer  implements Customer{
    @Override
    public double getDiscount(double amount) {
        return amount * 0.15;
    }
}
