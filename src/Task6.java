import java.util.Scanner;

public class Task6 {
    public static void main (String [] args){
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Enter your value:");

        int Number = inputNumber.nextInt();
        int rest = Number % 3;

        if (rest == 0) {
            System.out.println("This number is multiple of three.");
        } else {
            System.out.println("This number is not multiple of three, the rest is: " + rest);
        }
    }
}
