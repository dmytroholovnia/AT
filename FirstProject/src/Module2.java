import java.util.Scanner; // подключение сканнера

public class Module2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int firstNumber = in.nextInt();

        System.out.println("Input another number: ");
        int secondNumber = in.nextInt();

        System.out.println("... and one more please: ");
        int thirdNumber = in.nextInt();

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("First one is the biggest! " + firstNumber);

        } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("Second number is biggest." + secondNumber);

        } else {
            System.out.println("The last number is the biggest!");
        }

    }
}