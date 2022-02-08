class Box{
    double width;
    double height ;
    double depth;
    //Computer and return volume
    double volume()
    {
        return width*height*depth;
    }
    //Set dimensions of box
    void setDim(double w,double h, double d){
        width =w;
        height = h;
        depth = d;
    }
}
class addingMethod {
    public static void main(String[] args) {
        Box myBox1= new Box();
        double vol ;
        myBox1.setDim(2,5,6);
        vol = myBox1.volume();
        System.out.println("The volume is "+vol);
    }
}