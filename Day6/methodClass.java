class Box{
    double width;
    double height;
    double depth;
    double vol()
    {
       return (width*height*depth);
    }
}
public class methodClass{
    public static void main(String[] args) {
        double val;
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        //Assign values to myBox's instance variable

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 30;

       val = myBox1.vol();
        System.out.println("The first box volume is "+val);

        myBox2.width = 15;
        myBox2.height = 25;
        myBox2.depth = 35;
        val =  myBox2.vol();
        System.out.println("The second box volume is "+val);

    }
}