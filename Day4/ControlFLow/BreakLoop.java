package ControlFLow;

public class BreakLoop {
    public static void main(String[] args) {
        for(int i = 1;i<100;i++)
        {
            if(i == 11)break;
            System.out.println("i: "+i);
        }
        System.out.println("Loop complete.");
    }
}
