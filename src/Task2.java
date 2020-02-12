import java.util.Scanner;

public class module2_exchange {
    public static void main (String[] args) {

        double income;

        System.out.println("You invest in our project and we'll double your money!");
        Scanner in = new Scanner(System.in);
        double investment = in.nextDouble();

        System.out.println("Some more money..");
        double moreInvestment = in.nextDouble();

        income = investment;
        investment = moreInvestment;
        moreInvestment = income;

        System.out.println(income);





    }
}
