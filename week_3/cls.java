import java.util.Scanner;

class cls1 {
    void add(int p,int q) {
        System.out.println(p+q);
    }
}

class cls2 extends cls1 {
    void mul(int p, int q) {
        System.out.println(p*q);
    }
    void task(int p, int q) {
        System.out.print(p*p + q*q);
    }
}

public class cls {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        cls2 obj=new cls2();
        
        System.out.print("Enter an integer: ");
        int a=sc.nextInt();
        
        System.out.print("Enter an integer: ");
        int b=sc.nextInt();
        sc.close();
        
        obj.add(a,b);
        obj.mul(a,b);
        obj.task(a,b);
    }
}
