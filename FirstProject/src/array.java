import java.util.Arrays;

public class array {        //создать массив и набить его элементами через цикл

    public static void main(String[] args) {
//        int[] arr = new int[10];
//
//
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 1) {
//                arr[i] = i;
//            }
//            System.out.println(arr[i]);
//        }

        // набить 3*3

        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {           //посмотреть как это вывести через arr.length
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j;
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
