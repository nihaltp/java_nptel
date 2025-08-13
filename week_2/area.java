import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.print("Enter the width: ");
        int width = sc.nextInt();
        sc.close();
        
		int area = length * width;
        System.out.print("Area is: " + area);
    }
}
