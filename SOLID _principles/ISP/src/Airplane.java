public class Airplane implements Drive,Fly{
    @Override
    public void drivee() {
        IO.println("Airplane is moving");

    }

    @Override
    public void flyy() {
        IO.println("Airplane is Flyinh");

    }
}
