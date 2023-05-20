package HomeWork5;

public class User {

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String name;
    private int age;
    public String email = "someEmail@.email.com";
    private String password;
    public boolean isActive;
    public static double amountSpentMoney;
    public int discount;

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public double getAmountSpentMoney() {
        return amountSpentMoney;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Field name is required");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("You must be at least 18 years old to use this service");
        } else if (age > 99) {
            System.out.println("Invalid age. Please enter a valid age below 99");
        } else {
            this.age = age;
        }
    }

    public void setPassword(String password) {
        if (password.length() < 3) {
            System.out.println("Field password must be at least 3 symbols");
        } else if (password.length() > 8) {
            System.out.println("Field password must be less or equals 8 symbols");
        } else {
            this.password = password;
        }
    }

    public void setDiscount (int discount) {
        this.discount = discount;
    }
    public static double printTotalAmountOfSpentMoney (double userTotalAmountOfSpentMoney) {
        System.out.println("User total amount of spent money: " + userTotalAmountOfSpentMoney);
        return userTotalAmountOfSpentMoney;
    }

    public static double makePurchase(double firstNum, double secondNum) {
        double amountSpentMoney = Calculator.addition((int) firstNum, (int) secondNum);
        System.out.println("Your purchase price: " + firstNum);
        return amountSpentMoney;
    }

    public void setAmountSpentMoney(double amountSpentMoney) {
        this.amountSpentMoney = amountSpentMoney;
    }

    public static void addDiscount(int discount) {
        double percentage = ((double) discount / amountSpentMoney) * 100;
        System.out.println("Discount for your purchase is " + discount + "%" + " and it's = " + percentage + " of your money");
    }
}
