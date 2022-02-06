package ControlFLow;

public class findMidPoint {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;
        //Find the mid point of this data
        while(++i<--j);//No body in this while loop
        System.out.println("The mid point is "+i);
    }
}
