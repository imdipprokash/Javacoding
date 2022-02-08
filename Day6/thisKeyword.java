class Box{
    double width;
    double height ;
    double depth;
    //Computer and return volume
    double volume()
    {
        return width*height*depth;
    }
    //Set dimensions of box using this Keyword
    void setDim(double width,double height, double depth){
        this.width =width;
        this.height = height;
        this.depth = depth;
    }
}
class thisKeyword {
    public static void main(String[] args) {
        Box myBox1= new Box();
        double vol ;
        myBox1.setDim(2,5,6);
        vol = myBox1.volume();
        System.out.println("The volume is "+vol);
    }
}