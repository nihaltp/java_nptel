import java.util.Scanner;

public class volume {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = in.nextDouble();
        System.out.print("Enter height: ");
        double height = in.nextDouble();
        in.close();
        
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Volume is: %.2f", volume);
    }
}
