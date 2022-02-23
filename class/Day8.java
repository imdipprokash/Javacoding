//All about class
import  java.util.Scanner;
class Room{
    float length, breadth;
    void getdata(float a, float b){
        length = a;
        breadth = b;
    }
}
class twoClass{
    public static void main(String[] args){
        Scanner indata = new Scanner(System.in);
        float area;
        Room room1 = new Room();
        System.out.println("Enter the length & breadth");
        room1.getdata(indata.nextFloat(),indata.nextFloat());
        area =  room1.length * room1.breadth;
        System.out.println("Area is: "+area);

    }
}