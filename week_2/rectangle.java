import java.util.Scanner;

public class rectangle {
    static class Rectangle {
        int length;
        int width;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = sc.nextInt();
        System.out.print("Enter the width: ");
        int w = sc.nextInt();
        sc.close();
        
        Rectangle rect = new Rectangle();
        rect.length = l;
        rect.width = w;
        
        int sum = rect.length + rect.width;
        System.out.print("Sum of length and width is: " + sum);
    }
}
