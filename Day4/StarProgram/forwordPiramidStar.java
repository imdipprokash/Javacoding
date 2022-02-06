

import java.util.Scanner;

public class forwordPiramidStar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        
        for (int i=rows;i>0;i--)
        {
            //Print Space
            for(int j=1;j<i;j++ )
            {
                System.out.print(" ");
            }
            //Printing Star here
            for(int j= 0;j<(rows*2-(i*2-1));j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
