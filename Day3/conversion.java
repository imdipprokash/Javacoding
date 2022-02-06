public class conversion {
    public static void main(String[] args) {
        byte b; int a=357;
        double d = 324.434;
        System.out.println("\nConversion of int to byte.");

        b = (byte) a;
        System.out.println("a and b "+a+" "+b);

        System.out.println("\nConversion of double to int.");
        a = (int) d;
        System.out.println("d and a "+d+" "+a);

        System.out.println("\nConversion of double to byte.");
        b = (byte) d;
        System.out.println("d and b is "+d+" "+b);

    }
}
