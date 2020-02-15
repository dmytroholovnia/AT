import java.util.Scanner;

public class Task11 {
    public static  void main (String [] args) {

        System.out.println("Enter number of digits in number: ");
        Scanner input = new Scanner(System.in);

        int inputNumber = input.nextInt();
        String str = Integer.toString(inputNumber);
        int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                int digits = Integer.parseInt("" + str.charAt(i));
                if (digits % 2 == 0) {
                    sum += digits;
                }
            }

            System.out.println(sum);
        }

}