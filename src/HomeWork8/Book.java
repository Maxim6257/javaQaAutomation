package HomeWork8;

public class Book implements Printable {
    String bookName;

    public String getBookName() {
        return bookName;
    }
    @Override
    public void print() {
        System.out.println(bookName);
    }
    public static void printBooks(Printable[] goods) {
        for (Printable item : goods) {
            if (item instanceof Book) {
                System.out.println(((Book) item).getBookName());
            }
        }
    }

    public static void main (String[] args) {
        Book firstBook = new Book();
        firstBook.bookName = "My First Book";
        firstBook.print();
    }
}
