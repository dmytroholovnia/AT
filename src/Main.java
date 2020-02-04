import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {
            int sum;
            Scanner in = new Scanner(System.in);
            System.out.print("Input first number:");
            int firstNum = in.nextInt();
            System.out.print("Input second number:");
            int secondNum = in.nextInt();

            sum = firstNum % secondNum;

            System.out.println(sum);

        }
    }
}