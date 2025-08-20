import java.util.Scanner;

class student {
    private String name;
    private int age;
    
    student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    String getName() {
        return this.name;
    }
    int getAge() {
        return this.age;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = scanner.next();
        
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        
        student student = new student(name, age);
        System.out.print("Name: " + student.getName() + ", Age: " + student.getAge());
        
        scanner.close();
    }
}