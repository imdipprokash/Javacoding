class Box{
    double width;
    double height;
    double depth;
    double vol()
    {
        return (width*height*depth);
    }
}
public class valueReturn{
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //Assign values to mybox's instance variable
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 30;

       vol = mybox1.vol();
       System.out.println("Volume of first box is "+vol);

        mybox2.width = 15;
        mybox2.height = 25;
        mybox2.depth = 35;
        
       vol =  mybox2.vol();
       System.out.println("Volume of second box is "+vol);

        //Get volume of 

    }
}
