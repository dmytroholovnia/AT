import java.util.Scanner;

public class Task12 {
    public static  void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for factorial:");
        int putValue = input.nextInt();
        int factorial = 1;

        for (int i = 1; i <= putValue; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
     }
}
