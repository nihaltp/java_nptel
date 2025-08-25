import java.util.Scanner;

public class add {
    static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
        
		public int add(int a, int b, int c) {
            return a + b + c;
        }
        
        public void printThreeSum(int x, int y, int z) {
            int sum = add(x, y, z);
            System.out.println("Sum of three numbers: " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number one: ");
        int a = sc.nextInt();
        System.out.print("Enter number two: ");
        int b = sc.nextInt();
        
        System.out.print("Enter number one: ");
        int x = sc.nextInt();
        System.out.print("Enter number two: ");
        int y = sc.nextInt();
        System.out.print("Enter number three: ");
        int z = sc.nextInt();
        
        Calculator calc = new Calculator();
        
        int sumTwo = calc.add(a, b);
        System.out.println("Sum of two numbers: " + sumTwo);
        
        calc.printThreeSum(x, y, z);
        
        sc.close();
    }
}
