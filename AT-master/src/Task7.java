import java.util.Scanner;

public class Task7 {
    public static  void main (String [] args) {

        System.out.println("Enter 3 sides of triangle:");

        Scanner scan = new Scanner(System.in);
        int triangleSide1 = scan.nextInt();
        int triangleSide2 = scan.nextInt();
        int triangleSide3 = scan.nextInt();


        if ((triangleSide1 + triangleSide2) > triangleSide3 && (triangleSide1 + triangleSide3) > triangleSide2 && (triangleSide2 + triangleSide3) > triangleSide1) {
            System.out.println("Triangle doesn't exist.");
        }  else {
            System.out.println("Do you like geometry? Your triangle's sides are: " + triangleSide1 + "cm " + triangleSide2 + "cm " + triangleSide3 + "cm");
        }
    }
}
