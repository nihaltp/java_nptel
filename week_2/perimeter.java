import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.print("Enter the width: ");
        int width = sc.nextInt();
        sc.close();
        
		int perimeter = 2 * (length + width);
        System.out.println("Perimeter is: " + perimeter);
    }
}
