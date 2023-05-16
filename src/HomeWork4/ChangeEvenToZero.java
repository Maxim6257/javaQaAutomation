package HomeWork4;

import java.util.Random;

public class ChangeEvenToZero {
    public static void main(String[] args) {

        int[] arrayOfNumbers = new int[100];
        Random random = new Random();

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(500);
        }

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int even = arrayOfNumbers[i] % 2;
            if (even == 0) {
                arrayOfNumbers[i] = 0;
            }
        }

        for (int value : arrayOfNumbers) {
            System.out.println(value);
        }

    }
}
