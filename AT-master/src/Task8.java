import java.util.Scanner;

public class Task8 {
    public static  void main (String [] args) {
        System.out.println("How old are you?");
        Scanner scanAge = new Scanner(System.in);
        int age = scanAge.nextInt();
        byte group = 0;

        if (age > 0 && age <= 10) {
            group = 1;
        } else if (age > 10 && age <= 20) {
            group = 2;
        } else if (age > 20 && age <= 30) {
            group = 3;
        } else if (age > 30 && age <= 40){
            group = 4;
        } else if (age > 40 && age <= 50) {
            group = 5;
        } else if (age > 50 && age <= 60) {
            group = 6;
        } else if (age > 70 && age <= 80) {
            group = 7;
        } else if (age > 80 && age <= 90) {
            group = 8;
        } else if (age > 90 && age <= 100) {
            group = 9;
        } else {
            System.out.println("Try again.");
        }

        switch (group) {
            case 1:
                System.out.println("0 - 10");
                break;
            case 2:
                System.out.println("11 - 20");
                break;
            case 3:
                System.out.println("21 - 30");
                break;
            case 4:
                System.out.println("41 - 50");
                break;
            case 5:
                System.out.println("51 - 60");
                break;
            case 6:
                System.out.println("61 - 70");
                break;
            case 7:
                System.out.println("71 - 80");
                break;
            case 8:
                System.out.println("81 - 90");
                break;
            case 9:
                System.out.println("91 - 100");
                break;
        }
    }
}
