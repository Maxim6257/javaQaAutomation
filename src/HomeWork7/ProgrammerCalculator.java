package HomeWork7;

public class ProgrammerCalculator extends EngineerCalculator {
    public double  degree (double userNum, double userDegree) {
        double yourDegree = Math.pow(userNum, userDegree);
        return yourDegree;
    }
    public static void main(String[] args) {
        ProgrammerCalculator firstProgCalc = new ProgrammerCalculator();
        double userNumber = 3;
        double userDegree = 6;
        double someTestVariable = firstProgCalc.degree(userNumber,userDegree);
        System.out.println(someTestVariable);
    }
}
