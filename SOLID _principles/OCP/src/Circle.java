public class Circle implements Shape{
    private double redius;

    public Circle(double redius) {
        this.redius = redius;
    }

    @Override
    public double area() {
        return Math.PI * redius * redius;
    }
}
