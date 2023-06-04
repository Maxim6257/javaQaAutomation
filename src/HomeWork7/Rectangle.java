package HomeWork7;

public class Rectangle extends Shape {
    double firstRectangleSide;
    double secondRectangleSide;

    @Override
    public void calculateArea() {
        double rectangleArea = firstRectangleSide * secondRectangleSide;
        System.out.println("Rectangle area is " + rectangleArea);
    }
    @Override
    public void calculatePerimeter() {
        double rectanglePerimeter =  firstRectangleSide * 2 + secondRectangleSide * 2;
        System.out.println("Rectangle perimeter is " + rectanglePerimeter);
    }

    @Override
    public void paint(String color) {
        setColor(color);
        System.out.println("Color of your rectangle is " + this.color);
    }

    public static void main(String[] args) {
        Rectangle myFirstRectangle = new Rectangle();
        myFirstRectangle.firstRectangleSide = 4;
        myFirstRectangle.secondRectangleSide = 5;
        myFirstRectangle.calculateArea();
        myFirstRectangle.calculatePerimeter();
        myFirstRectangle.paint("green");
    }
}
