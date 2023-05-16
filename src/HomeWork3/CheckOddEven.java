package HomeWork3;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {

        //get user number
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = num.nextInt();

        if (number % 2 == 0) {
            System.out.println("Your number " + number + " is Even number");
        } else {
            System.out.println("Your number " + number + " is Odd number");
        }

        System.out.println("Bye");
        num.close();
    }
}
