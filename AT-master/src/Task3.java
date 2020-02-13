import java.util.Scanner;

public class Task3 {

    public static void main(String [] args){
        System.out.println("Insert 2 numbers:");

        Scanner in1 = new Scanner(System.in);
        int inputValue1 = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        int inputValue2 = in2.nextInt();

        if ( inputValue1 % 2 != 0 ) {
            System.out.println("Odd value: "+ inputValue1);
        } else {
           // System.out.println("The first one is even. ");
        }

        if ( inputValue2 % 2 != 0 ) {
            System.out.println("Odd value: "+ inputValue2);
        } else {
            // System.out.println("The second number is even.");
        }

    }
}
