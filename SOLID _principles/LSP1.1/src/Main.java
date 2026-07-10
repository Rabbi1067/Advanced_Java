 //Liskov Substitution Principle (LSP)
void main() {
    Sparrow sparrow = new Sparrow();
    sparrow.eat();
    sparrow.fly();
    IO.println();

    Penguin penguin = new Penguin();
    penguin.eat();
    penguin.swim();
    IO.println();

    Shape rectangle = new Rectangle(4,5) ;
    IO.println("Rectangle Area: "+rectangle.getArea());
    Shape square= new Square(3);
    IO.println("Square Area: "+square.getArea());

}
