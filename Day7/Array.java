import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double arr[] = new double [5];
        System.out.print("Enter the limit of array ");
        int limit = obj.nextInt();

        for (int i = 0 ;i<limit;i ++){
            System.out.print("Enter element value: ");
            arr[i] = obj.nextDouble();
        }
        for (int i = 0 ; i<limit;i++){
            System.out.println("Array location "+i+" and element "+arr[i]);
        }
    }
}