package HomeWork5;

import static HomeWork5.User.makePurchase;
import static HomeWork5.User.printTotalAmountOfSpentMoney;
import static HomeWork5.User.addDiscount;

public class UserFunctionalCheck {
    public static void main(String[] args) {

        User firstUser = new User();
        firstUser.name = "Paolo";
        firstUser.email = "PaoloItaliano@blablabla.it";
        firstUser.setPassword("123456");
        firstUser.isActive = true;
        int firstUserSumOfPurchase = 200;
        int userDiscount = 10;
        firstUser.setDiscount(10);
        double sum = firstUser.getAmountSpentMoney();
        firstUser.setAmountSpentMoney(makePurchase(sum, firstUserSumOfPurchase));

        User secondUser = new User();
        secondUser.name = "John Smith";
        secondUser.email = "jhonsmith@gmail.com";
        secondUser.setPassword("12345678");
        secondUser.isActive = false;
        int secondUserSumOfPurchase = 242;

        System.out.println(firstUser.name);
        System.out.println(firstUser.email);
        System.out.println(firstUser.getPassword());
        System.out.println(firstUser.isActive);
        System.out.println(printTotalAmountOfSpentMoney(makePurchase(firstUserSumOfPurchase, firstUser.getAmountSpentMoney())));
        addDiscount(userDiscount);

        System.out.println("============================");

        System.out.println(secondUser.name);
        System.out.println(secondUser.email);
        System.out.println(secondUser.getPassword());
        System.out.println(secondUser.isActive);
        System.out.println(printTotalAmountOfSpentMoney(makePurchase(secondUserSumOfPurchase, secondUser.getAmountSpentMoney())));

    }

}
