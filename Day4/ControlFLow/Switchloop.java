package ControlFLow;

public class Switchloop{
    public static void main(String[] args) {
       for (int i = 0; i<6;i++)
       switch (i) {
           case 0:
               System.out.println("i is Zero");
               break;
            case 1:
                System.out.println("i is One");
                break;
            case 2:
                System.out.println("i is Two");
                break;
            case 3:
                System.out.println("i is Three");
                break;
            case 4:
                System.out.println("i is Four");
                break;

           default:
            System.out.println("i is greather than 4.");
               break;
       }
    }
    
}
