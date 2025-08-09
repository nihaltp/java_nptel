import java.util.Scanner;

class divide {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first integer for division: ");
        int x = sc.nextInt();
        System.out.print("Enter second integer for division: ");
        int y = sc.nextInt();
        sc.close();
        
        System.out.println("The Quotient is = " + x / y);
        System.out.println("The Remainder is = " + x % y);
    }
}
