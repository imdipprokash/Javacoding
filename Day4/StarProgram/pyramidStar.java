
/*****
  ***     pyramidStar Revrse Star program
   */
import java.util.Scanner;

public class pyramidStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i=1 ;i<=n;i++)
        {
            for (int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<= (n*2-(2*i-1));j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }

    
}