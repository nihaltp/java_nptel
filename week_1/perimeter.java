import java.util.Scanner;

public class perimeter {
    public static void main(String[] strings) {
        double width;
        double height;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the width of the rectangle: ");
        width = in.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        height = in.nextDouble();
        in.close();
        
        double perimeter = 2 * (width + height);
        double area = width * height;
        
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n", height, width, perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f", width, height, area);
    }
}
