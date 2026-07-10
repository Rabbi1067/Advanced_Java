
void main() {
Book book = new Book("java programming","Rabbi");
Printer printer = new  Printer();
printer.print(book);
BookDatabase database = new BookDatabase();
database.save(book);

}
