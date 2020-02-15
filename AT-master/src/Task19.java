import java.util.Scanner;

public class Task19 {
    public static void main (String [] args) {

        System.out.println("enter a number: ");
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        String action = scan.next();
        int num2 = scan.nextInt();

        switch (action) {
            case ("+"):
                System.out.println( num1 + " + "+ num2 + " = " + (num1 + num2));
                break;

            case ("-"):
                System.out.println( num1 + " - "+ num2 + " = " + (num1 - num2));
                break;

            case  ("*"):
                System.out.println( num1 + " * "+ num2 + " = " + (num1 * num2));
                break;

            case ("/"):
                if (num2 != 0) {
                    System.out.println( num1 + " / "+ num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("You can't divide by 0.");
                }
                break;
            }
        }


    }

