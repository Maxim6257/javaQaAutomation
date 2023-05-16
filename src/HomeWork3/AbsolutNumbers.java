package HomeWork3;

import java.util.Scanner;

public class AbsolutNumbers {
    public static void main(String[] args) {

        Scanner userFirstNumber = new Scanner(System.in);
        System.out.println("Enter your First number:");
        int firstNumber = userFirstNumber.nextInt();
        int firstNumberAbsolute = Math.abs(firstNumber);

        Scanner userSecondNumber = new Scanner(System.in);
        System.out.println("Enter your Second number:");
        int secondNumber = userSecondNumber.nextInt();
        int secondNumberAbsolute = Math.abs(secondNumber);


        if (firstNumberAbsolute > secondNumberAbsolute) {
            System.out.println("Absolute number is: " + firstNumber);
        } else {
            System.out.println("Absolute number is: " + secondNumber);
        }

        userFirstNumber.close();
        userSecondNumber.close();
    }
}
