package HomeWork5;

import HomeWork5.User;
import HomeWork5.Calculator;

import static HomeWork5.User.makePurchase;
import static HomeWork5.User.printTotalAmountOfSpentMoney;

public class Main {
    public static void main(String[] args) {

        String userName = "name";
        String userPassword = "pass";
        int userAge = 26;
        double purchasePrice = 200;

        User firstUser = new User();
        firstUser.setName(userName);
        firstUser.setAge(userAge);
        firstUser.setPassword(userPassword);
        double sum = firstUser.getAmountSpentMoney();
        firstUser.setAmountSpentMoney(makePurchase(sum, purchasePrice));
        double userTotalAmountOfSpentMoney = firstUser.getAmountSpentMoney();

        System.out.println("Your age: " + firstUser.getAge());
        System.out.println("Your password: " + firstUser.getPassword());

        double testAddition = Calculator.addition(10, 5);
        System.out.println("10 + 5 = " + testAddition);

        double testSubtraction = Calculator.subtraction(10, 5);
        System.out.println("10 - 5 = " + testSubtraction);

        double testMultiplication = Calculator.multiplication(10, 5);
        System.out.println("10 * 5 = " + testMultiplication);

        double testDivision = Calculator.division(10, 5);
        System.out.println("10 / 5 = " + testDivision);

        printTotalAmountOfSpentMoney(userTotalAmountOfSpentMoney);

    }
}