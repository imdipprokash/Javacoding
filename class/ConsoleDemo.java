public class ConsoleDemo{
    public static void main(String[] args) {
        try{

            System.out.print("What is your name: ");
            String  name = System.console().readLine();
            System.out.println("You enter your name as : "+name);
        }
        catch (Exception e)
        {
            System.out.println("The Error is : "+e);
        }

    }
}