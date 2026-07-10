public class RegularCustomer implements Customer{
    @Override
    public double getDiscount(double amount) {
        return amount * 0.05;
    }
}
