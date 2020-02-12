import java.util.Scanner;
import java.util.Random;

public class Task4 {
        public static void main (String [] args){
            Random unknownNumber = new Random();
            Scanner scan = new Scanner(System.in);
            int count = 0;
            int bingo = -1;
            int number = unknownNumber.nextInt(10);

            while (count < 5 && bingo != number) {

                System.out.println("Try to guess a number! Enter a number: ");
                bingo = scan.nextInt();
                if (number != bingo) {
                    System.out.println("Your number is " + ((bingo > number)? "bigger" : "fewer"));
                    count++;
                }
            }
            System.out.println("You " + ((bingo == number)? "win! " : "lose...") + number);
        }
}
