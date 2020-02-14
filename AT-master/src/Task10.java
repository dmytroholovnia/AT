import java.util.Scanner;

public class Task10 {
    public static  void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int rest;

        do {
            rest = number % 2;
        } while (rest > 1);

        if ( rest > 0) {
            System.out.println("The value is odd. (" + number + ").");  // to do попробовать проверять только последнюю цифру на четность
        } else {
            System.out.println("The value is even. (" + number + ").");
        }
    }
}
