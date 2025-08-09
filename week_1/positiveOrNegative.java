import java.util.Scanner;

public class positiveOrNegative {
    public static void main (String[] args) {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        in.close();
    }
}
