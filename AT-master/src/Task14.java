import  java.lang.String;

public class Task14 {
    public static void main (String [] args) {
        String str = "1674";
        int sum = 0;
        int multiply = 1;

        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt("" + str.charAt(i));
            multiply *= Integer.parseInt("" + str.charAt(i));
        }

        System.out.println(sum);
        System.out.println(multiply);
    }
}
