  //Open/Closed Principle (OCP)
void main() {

    DiscountCalculator calculator = new DiscountCalculator();
    Customer regular  = new RegularCustomer();
    Customer premium  = new PremiumCustomer();
    Customer vip  = new VipCustomer();
    double amount = 1000;
    IO.println("Regular Discount: "+calculator.calculateDiscount(regular,amount));
    IO.println("Premium  Discount: "+calculator.calculateDiscount(premium,amount));
    IO.println("Vip Discount: "+calculator.calculateDiscount(vip,amount));
    Customer gold = new GoldCustomer();
    IO.println("Gold Discount: "+calculator.calculateDiscount(gold,amount));
    IO.println();
    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(5,18);
    IO.println("Circle Area: "+circle.area());
    IO.println("Rectangle Area: "+rectangle.area());
    Shape triangle = new Triangle(4,5);
    IO.println("Triangle Area: "+triangle.area());









}
