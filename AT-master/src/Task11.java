import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Task11 {
    public static  void main (String [] args) {

        System.out.println("Enter number of digits in number: ");
        Scanner input = new Scanner(System.in);

        int inputNumber = input.nextInt();
        int arrayNumber[] = new int [inputNumber];

        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println("Enter" + " " + i + " " + "number of the array");//hint: i надо было сравнивать c переменной которая инициализировалась в массиве (arrayNumber[]), поэтому length не считался
            arrayNumber[i] = input.nextInt();               //принимаем все числа массива
        }

        List<Integer> even = new ArrayList<Integer>();

        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] % 2 == 0) {
                even.add(arrayNumber[i]);
            }
        }

        int evenSum = 0;                                           //объявление переменной для подсчета суммы четных чисел

        for (int i = 0; i < even.size(); i++) {                //подсчет четных чисел
            evenSum = evenSum + even.get(i);
        }

        System.out.println("Summary of even numbers: " + evenSum);

    }
}