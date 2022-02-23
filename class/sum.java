import  java.util.Scanner;
class Sum {
    public static void main(String[] args) {
        System.out.println("Here is your addition program::");
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the 1st number:");
        a = obj.nextInt();
        System.out.print("Enter the 2nd number:");
        b = obj.nextInt();
        a = a+b;
        System.out.println("The sum of two numbers is : "+a);
    }
}