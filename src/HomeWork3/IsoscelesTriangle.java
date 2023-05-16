package HomeWork3;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {

        Scanner triangleFirstSide = new Scanner(System.in);
        System.out.println("Enter First triangle side: ");
        int firstSide = triangleFirstSide.nextInt();

        Scanner triangleSecondSide = new Scanner(System.in);
        System.out.println("Enter Second triangle side: ");
        int secondSide = triangleSecondSide.nextInt();

        Scanner triangleThirdSide = new Scanner(System.in);
        System.out.println("Enter Third triangle side: ");
        int thirdSide = triangleThirdSide.nextInt();

        if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
            System.out.println("Your triangle is isosceles");
        } else {
            System.out.println("Your triangle isn't isosceles");
        }

        triangleFirstSide.close();
        triangleSecondSide.close();
        triangleThirdSide.close();
    }
}
