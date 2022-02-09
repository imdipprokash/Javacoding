
import java.util.Scanner;

class Main{
    //Can't print double ar double
    static  Scanner obj = new Scanner(System.in);
    public static void main(String[] args){
        int a; float b; long c;
        System.out.print("Enter an Integer: ");
        a = obj.nextInt();
        System.out.print("Enter a Float: ");
        b = obj.nextFloat();
        System.out.print("Enter a long: ");
        c = obj.nextLong();
        System.out.println("Pls, Verify that you have enter "+a+" ,"+b+" and "+c);
    }
}