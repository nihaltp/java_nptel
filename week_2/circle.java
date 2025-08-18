import java.util.Scanner;

public class circle {
    static class Circle {
        int radius;
        
        Circle(int radius) {
            this.radius = radius;
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Enter radius of the circle:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();
        
        Circle c = new Circle(r);
        System.out.println("Radius of the circle is: " + c.radius);
    }
}
