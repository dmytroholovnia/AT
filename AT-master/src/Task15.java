public class Task15 {
    public static void main (String [] args) {
        int num = 50;

        for (int i = 1; i <= num ; i++) {
            int boom = i * i;

            if(boom < num) {
                System.out.println(boom);
            } else {
                return;
            }
        }

       }
}
