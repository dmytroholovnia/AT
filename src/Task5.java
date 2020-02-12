import java.util.Scanner;

public class Task5 {
    public static void main (String [] args){
        System.out.println("Enter a year: ");

        Scanner inputYear = new Scanner(System.in);
        int year = inputYear.nextInt();

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Number of days in year is 366.");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println("Number of days in year is 366.");
        } else if (year % 100 == 0) {
            System.out.println("Number of days in year is 365.");
        } else {
            System.out.println("Number of days in year is 365.");
        }
    }
}
