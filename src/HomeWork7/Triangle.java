package HomeWork7;

import java.util.Objects;

public class Triangle extends Shape {
    double firstSide;
    double secondSide;
    double thirdSide;

    @Override
    public void calculateArea() {
        double triangleArea = (firstSide + secondSide + thirdSide) * 0.5;
        System.out.println("Triangle area is " + triangleArea);
    }

    @Override
    public void calculatePerimeter() {
        double trianglePerimeter = firstSide + secondSide + thirdSide;
        System.out.println("Triangle perimeter is " + trianglePerimeter);
    }

    @Override
    public void paint(String color) {
        setColor(color);
        System.out.println("Color of your object - " + this.color);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Triangle myFirstTriangle = new Triangle();
        myFirstTriangle.firstSide = 5;
        myFirstTriangle.secondSide = 4;
        myFirstTriangle.thirdSide = 2;
        myFirstTriangle.paint("blue");
        myFirstTriangle.calculateArea();
    }
}
