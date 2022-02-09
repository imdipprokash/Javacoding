import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the 1st number: ");
        a = obj.nextInt();
        System.out.print("Enter the 2nd number: ");
        b = obj.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap a is "+a+" and b is "+b);

    }
}