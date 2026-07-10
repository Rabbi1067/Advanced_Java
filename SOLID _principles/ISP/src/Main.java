   //Interface Segregation Principle (ISP)
void main() {
Printable basic = new BasicPrinter();
basic.print();
    IO.println();
    MultiFunctionPrinter mfp = new MultiFunctionPrinter();
    mfp.print();
    mfp.fax();
    mfp.scan();
    IO.println();
    Drive car = new  Car();
    car.drivee();
    Airplane airplane = new Airplane();
    airplane .drivee();
    airplane.flyy();


}
