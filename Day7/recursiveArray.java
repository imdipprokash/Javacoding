//Print array element using recursion
class RectTest{
    int values[];
    RectTest(int i){
        values = new int[i];

    }
    //display array --recursively
    void printArray(int i){
        if(i == 0) return;
        else
            printArray(i-1);
        System.out.println("["+(i-1)+"]"+values[i-1]);
    }
}
class recursiveArray {
    public static void main(String[] args) {
        RectTest ob = new RectTest(10);
        int i;
        for(i = 0 ;i<10;i++) ob.values[i]=i;
        ob.printArray(10);
    }
}