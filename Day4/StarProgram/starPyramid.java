import java.util.Scanner;

public class starPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows numbers: ");
        int rows = input.nextInt();
        input.close();
        //int space = rows-1;
        for(int i = 1;i<=rows;i++)
        {
            //Print number of spaces rows-1
            for(int j =i; j <rows;j++)
            {
                System.out.print(" ");
            }
            //Print number of stars row*2 -1
            for (int j = 1 ; j<i*2;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
