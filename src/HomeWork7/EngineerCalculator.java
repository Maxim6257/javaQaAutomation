package HomeWork7;

public class EngineerCalculator extends BuhalterCalculator{

    public double sqrtOfNum (double userNum) {
        double result = Math.sqrt(userNum);
        return result;
    }
    public static void main(String[] args) {
        EngineerCalculator firstCalc = new EngineerCalculator();
        double someVariable = firstCalc.sqrtOfNum(81);
        System.out.println(someVariable);
    }
}
