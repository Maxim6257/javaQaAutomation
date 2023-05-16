package HomeWork3;

import java.util.Scanner;

public class MiddleString {
    public static void main(String[] args) {

        Scanner pairedQuantityText = new Scanner(System.in);
        System.out.println("Enter paired quantity text: ");
        String userText = pairedQuantityText.nextLine();

        int userTextMiddleIndex = userText.length() / 2;
        int fromIndex = userTextMiddleIndex - 1;
        int toIndex = userTextMiddleIndex + 1;

        String ourResult = userText.substring(fromIndex, toIndex);
        System.out.println(ourResult);

        pairedQuantityText.close();
    }
}
