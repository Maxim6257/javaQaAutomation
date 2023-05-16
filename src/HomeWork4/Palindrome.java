package HomeWork4;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner palindrome = new Scanner(System.in);
        System.out.println("Enter your text for checking it's palindrome or not:");
        String userText = palindrome.nextLine();
        char[] myString = userText.toCharArray();

//        ArrayList<String> revertArray = new ArrayList<>();

        String[] revertArray = new String[myString.length];

//        for (int i = myString.length; i > 0; i--) {
//            revertArray.add(String.valueOf(myString[i - 1]));
//        }

        for (int i = myString.length - 1; i >= 0 ; i--) {
            revertArray[i] = String.valueOf(myString[i]);
        }

        String TextUtils = null;
        String revertedSymbols = TextUtils.join("", revertArray);

        String lowCaseWithoutSpacesPalindrome = userText.toLowerCase().replaceAll("\\s", "");
        String lowCaseWithoutSpacesRevertedSymbols = revertedSymbols.toLowerCase().replaceAll("\\s", "");

        if (lowCaseWithoutSpacesPalindrome.equals(lowCaseWithoutSpacesRevertedSymbols)) {
            System.out.println("Phrase " + userText + " is palindrome");
        } else {
            System.out.println("Phrase " + userText + " isn't palindrome");
        }

        palindrome.close();
    }
}
