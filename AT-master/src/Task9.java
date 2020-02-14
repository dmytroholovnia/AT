import java.util.Scanner;
import static java.lang.Math.max;

public class Task9 {
    public static  void main (String [] args) {
        int firstValue;
        int secondValue;
        int thirdValue;

        System.out.print("Three space separated numbers: ");

        Scanner scan = new Scanner(System.in);
        firstValue = scan.nextInt();
        secondValue = scan.nextInt();
        thirdValue = scan.nextInt();
        
        System.out.println("The biggest is: " + max(max(firstValue, secondValue), thirdValue));
    }
    }

