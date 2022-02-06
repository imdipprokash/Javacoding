import java.util.Scanner;

public class halfDiaStarPattern {
    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the number of rows ");
     int rows = input.nextInt();
     int columns = 1;

     //Numbers of rows will be printed rows*2-1

     for (int i = 1;i<rows*2;i++)
     {
         for(int j = 1;j<=columns;j++)
         {
             System.out.print("*");
         }
         if(i<rows) columns ++;
         else columns --;
         
         System.out.println();
     }

     input.close();
    }
}
