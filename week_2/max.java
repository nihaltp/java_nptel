import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter term [" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
		for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Maximum is: " + max);
        sc.close();
    }
}
