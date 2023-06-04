package HomeWork8;

public class Magazine implements Printable {
    String magazineName;
    int totalPages;
    int ageRestrictions;

    public String getMagazineName() {
        return magazineName;
    }

    @Override
    public void print() {
        System.out.println("Name your magazine is " + magazineName + ", Total pages: " + totalPages + ", Age restrictions: " + ageRestrictions + "+");
    }

    public static void printMagazines(Printable[] goods) {
        for (Printable item : goods) {
            if (item instanceof Magazine) {
                System.out.println(((Magazine) item).getMagazineName());
            }
        }
    }

    public static void main(String[] args) {
        Printable[] goods = new Printable[3];

        Book firstBook = new Book();
        firstBook.bookName = "My First Book";

        Magazine playBoy = new Magazine();
        playBoy.magazineName = "Play Boy";
        playBoy.totalPages = 40;
        playBoy.ageRestrictions = 18;

        Magazine malyatko = new Magazine();
        malyatko.magazineName = "Малятко";
        malyatko.totalPages = 10;
        malyatko.ageRestrictions = 6;

        goods[0] = firstBook;
        goods[1] = playBoy;
        goods[2] = malyatko;

        for (Printable item : goods) {
            item.print();
        }

        Magazine.printMagazines(goods);
        Book.printBooks(goods);
    }
}
