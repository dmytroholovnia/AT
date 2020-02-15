public class Task13 {
    public static void main (String [] args) {
        int number = 15;
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= number ; i++) {
            if (i == 2 || i == 3 || i == 5 || i == 7) {
                sum += i;
                count ++;
            } else if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0)) {
                sum += i;
                count ++;
            }

        }
        System.out.println(sum);
        System.out.println(count);
    }

}
