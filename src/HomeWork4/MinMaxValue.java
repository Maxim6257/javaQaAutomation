package HomeWork4;

import java.util.Arrays;
import java.util.Random;

public class MinMaxValue {
    public static void main(String[] args) {

        int[] minMaxArray = new int[20];
        Random random = new Random();
        for (int i = 0; i < minMaxArray.length; i++) {
            minMaxArray[i] = random.nextInt();
        }

        int minimum = 0;
        int maximum = 0;
        for (int i = 0; i < minMaxArray.length; i++) {
            if (i == 0) {
                minimum = minMaxArray[i];
            }

            if (minMaxArray[i] < minimum) {
                minimum = minMaxArray[i];
            } else if (minMaxArray[i] >= maximum) {
                maximum = minMaxArray[i];
            }
        }
        System.out.println("Minimal value of Array = " + minimum);
        System.out.println("Maximum value of Array = " + maximum);

//        one more way ;)
//        Arrays.sort(minMaxArray);
//        int myArrayLength = minMaxArray.length;
//        int minValue = minMaxArray[0];
//        int maxValue = minMaxArray[myArrayLength - 1];
//        System.out.println(maxValue);
//        System.out.println(minValue);

    }
}
