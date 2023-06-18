package HomeWork7;

public class FinancialCalculator extends SimpleCalculator {
//    public double percentage(double percent, double userNumber) {
//        double userPercentage = (percent / 100) * userNumber;
//        return userPercentage;
//    }
    public double percentage(double percent, double userNumber) {
        double userPercentage = multiplication(division(percent, 100), userNumber);
        return userPercentage;
    }
    public static void main(String[] args) {
        FinancialCalculator financialCalc = new FinancialCalculator();
        double result = financialCalc.percentage(5, 200);
        System.out.println(result);
    }
}
