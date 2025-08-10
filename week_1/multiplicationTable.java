import java.util.Scanner;

class multiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number for multiplication table: ");
        int number = in.nextInt();
        System.out.print("Enter the limit for mutltiplication table: ");
        int max = in.nextInt();
        in.close();
        
        System.out.println();
        for (int i = 1; i <= max; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
