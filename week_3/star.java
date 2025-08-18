import java.util.Scanner;

class star {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = s.nextInt();
        s.close();
        
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
