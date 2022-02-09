//Object are passed by reference.
class Test{
    int a,b;
    Test(int i, int j){
        a = i ;
        b = j;

    }
    //Pass an object
    void maths(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}
class Scratch {
    public static void main(String[] args) {
        Test ob = new Test(15,20);

        System.out.println("a and b before call : "+ob.a+" "+ob.b);
        ob.maths(ob);
        System.out.println("a and b after call:"+ob.a+" "+ob.b);

    }
}