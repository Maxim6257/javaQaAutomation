package HomeWork7;

import HomeWork5.User;
import HomeWork5.Calculator;

import java.lang.reflect.Array;

import static HomeWork5.User.makePurchase;
import static HomeWork5.User.printTotalAmountOfSpentMoney;

import HomeWork8.Model;


public class Main {
    public static void main(String[] args) {
        int myBroNumber = 2441515;

    Model firstPhone = new Model();
    boolean firstBool = firstPhone.isCanCalling(true);
    firstPhone.call(myBroNumber);
    System.out.println(firstBool);








//        Shape[] figures = new Shape[3];
//
//        Circle firstCircle = new Circle();
//        firstCircle.circleRadius = 5.0;
//
//        Rectangle firstRectangle = new Rectangle();
//        firstRectangle.firstRectangleSide = 4.0;
//        firstRectangle.secondRectangleSide = 6.0;
//
//        Triangle firstTriangle = new Triangle();
//        firstTriangle.firstSide = 3.0;
//        firstTriangle.secondSide = 4.0;
//        firstTriangle.thirdSide = 5.0;
//
//        figures[0] = firstCircle;
//        figures[1] = firstRectangle;
//        figures[2] = firstTriangle;
//
//        for (Shape figure : figures) {
//            figure.calculateArea();
//            figure.calculatePerimeter();
//        }



    }






    //        String userName = "name";
//        String userPassword = "pass";
//        int userAge = 26;
//        double purchasePrice = 200;
//
//        User firstUser = new User();
//        firstUser.setName(userName);
//        firstUser.setAge(userAge);
//        firstUser.setPassword(userPassword);
//        double sum = firstUser.getAmountSpentMoney();
//        firstUser.setAmountSpentMoney(makePurchase(sum, purchasePrice));
//        double userTotalAmountOfSpentMoney = firstUser.getAmountSpentMoney();
//
//        System.out.println("Your age: " + firstUser.getAge());
//        System.out.println("Your password: " + firstUser.getPassword());
//
//        double testAddition = Calculator.addition(10, 5);
//        System.out.println("10 + 5 = " + testAddition);
//
//        double testSubtraction = Calculator.subtraction(10, 5);
//        System.out.println("10 - 5 = " + testSubtraction);
//
//        double testMultiplication = Calculator.multiplication(10, 5);
//        System.out.println("10 * 5 = " + testMultiplication);
//
//        double testDivision = Calculator.division(10, 5);
//        System.out.println("10 / 5 = " + testDivision);
//
//        printTotalAmountOfSpentMoney(userTotalAmountOfSpentMoney);


}