import  java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        System.out.println("Star programming:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of line: ");
        int line = input.nextInt();
        int star = 1;

        for (int i = 1 ; i < line; i++)
        {
            star = star+2;
        }
        System.out.println(star);
        int space  = star-2;
        for (int i = 0;i< star;i=i+2)
        {
            for (int j = 0;j< space;j++)
            {
                System.out.print(" ");
            }
            space = space -1;
            for(int j = 0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }
}