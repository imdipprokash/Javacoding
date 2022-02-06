package ControlFLow;
//Using multidimensional array for each .
public class mulArrForEach {
    public static void main(String[] args) {
        //int sum = 0;
        int nums[][]=new int[3][5];
        //Give nums some values
        for (int i = 0 ; i<3;i++)
        {
            for(int j =0;j<5;j++)
            {
                nums[i][j] = (i+1)*(j+1);
            }
        } 
        //Printing the values froms nums
        for(int x[]:nums)
        {
            for (int y:x)
            {
                System.out.println("The value of y is "+y);
            }
        }
    }
}
