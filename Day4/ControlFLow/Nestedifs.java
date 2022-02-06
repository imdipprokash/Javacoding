package ControlFLow;

public class Nestedifs {
    public static void main(String[] args) {
        int i = 10,j=10;
        if (i == 10)
        {
            if(j<20)
            {
                System.out.println("The value of j is less then 20");
            }
            else
            {
                System.out.println("The value of j is geter then 20");
            }
        }
        else System.out.println("The value is not equal to 10");
    }
}
