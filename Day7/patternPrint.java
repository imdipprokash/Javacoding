import java.util.Scanner;

class pattern {
    public static void main(String[] args) {
        System.out.println("Print Display");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        //Displaying condition
        for (int i = 1;i <= N; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }

    }
}