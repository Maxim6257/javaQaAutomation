package HomeWork7;


public class Circle extends Shape {
    double circleRadius;
    public void setCircleRadius() {
        this.circleRadius = circleRadius;
    }
    @Override
    public void calculateArea() {
        double circleArea = Math.PI * Math.pow(this.circleRadius, 2);
        System.out.println("Circle area is " + circleArea);
    }

    @Override
    public void calculatePerimeter() {
        double circlePerimeter = 2 * Math.PI * this.circleRadius;
        System.out.println("Circle perimeter is " + circlePerimeter);
    }

    @Override
    public void paint (String color) {
        setColor(color);
        System.out.println("Color of your circle - " + this.color);
    }
    public static void main(String[] args) {
        Circle myFirstCircle = new Circle();
        myFirstCircle.paint("red");
        myFirstCircle.circleRadius = 5;
        myFirstCircle.calculateArea();
        myFirstCircle.calculatePerimeter();
    }
}
