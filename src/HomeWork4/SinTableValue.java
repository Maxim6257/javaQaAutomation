package HomeWork4;

import java.util.ArrayList;

public class SinTableValue {
    public static void main(String[] args) {
        int degree = 360;

        ArrayList<Double> sinx = new ArrayList<>();
        ArrayList<Integer> sinx2 = new ArrayList<>();

        for (int i = 0; i <= degree; i += 10) {
            double degreeToRadian = Math.toRadians(i);
            double result = Math.sin(degreeToRadian);
            sinx.add(result);
            sinx2.add(i);
        }

        for (int i = 0; i < sinx.toArray().length; i++) {
            System.out.println("Sin(" + sinx2.toArray()[i] + ") = " + sinx.toArray()[i]);
        }
    }
}