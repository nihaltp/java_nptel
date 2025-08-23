import java.util.Scanner;

public class count_integers {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int start = 0;
        int n = 0;
        
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            if (start == 0) {
                if (numStr.charAt(i) != 0) {
                    start = 1;
                    n++;
                }
            } else {
                n++;
            }
        }
        
        System.out.print(n);
    }
}
