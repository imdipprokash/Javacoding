//A simple example of inheritance
//Create a superclass
class A{
    int i,j;
    void showij(){
        System.out.println("i and j:"+i+" "+j);
    }
}
//Create a subclass by extending class A
class B extends  A{
    int k;
    void  showK(){
        System.out.println("k: "+k);
    }
    void sum(){
        System.out.println("i+j+k = :"+(i+j+k));
    }
}
class simpleInheritance {
    public static void main(String[] args) {
       A superOb = new A();
       B subOb = new B();

       superOb.i = 10;
       superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Content of subOb: ");
        subOb.showK();
        System.out.println();

        System.out.println("Sum og i,j,k in subOb : ");
        subOb.sum();
    }
}