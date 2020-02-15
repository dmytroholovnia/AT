public class Task17 {
    public static void main (String [] args) {
        int pred = 5;
        int number = 10;
        int sum = 0;

        for (int i = 0; i <= pred; i++) {
            for (int j = 0; j <= pred; j++) {
                for (int k = 0; k <= pred; k++) {
                    sum = i + j + k;
                    if (sum == number) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }

            }
        }
    }

    }
