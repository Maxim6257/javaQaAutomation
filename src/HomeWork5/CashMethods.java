package HomeWork5;

public class CashMethods {
    public static double makePurchase(double firstNum, double secondNum) {
        double firstPlusSecond = Calculator.addition((int) firstNum, (int) secondNum);
        System.out.println("Your purchase price: " + firstNum);
        return firstPlusSecond;
    }

    public static double printTotalAmountOfSpentMoney (double userTotalAmountOfSpentMoney) {
        System.out.println("User total amount of spent money: " + userTotalAmountOfSpentMoney);
        return userTotalAmountOfSpentMoney;
    }
}
