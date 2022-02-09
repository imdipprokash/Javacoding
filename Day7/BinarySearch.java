import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

class BinarySearchRecursive
{
    static Scanner userInput = new Scanner(System.in);
    static int BinarySearch(double arr[], int l, int r, double x)
    {
        if (r >= l)
        {
            int mid = l+ (r - l)/ 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return BinarySearch(arr, l, mid - 1, x);

            return BinarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }

    public static void main(String args[]) throws FileNotFoundException
    {
        System.out.println("\n**Enter Data from text files***\nEnter file path : \t");
        String filepath = userInput.nextLine();  		//accepting a string from command line (the filepath)

        Scanner inp=new Scanner(new File(filepath));    //creating a scanner object and file object
        int limit = Integer.parseInt(inp.nextLine()); 	// first line of textfile contains number of elements the array should contain

        double key1 = Double.parseDouble(inp.nextLine());
        double key2 = Double.parseDouble(inp.nextLine());

        double arr[] = new double[limit]; 					//declaring array and allocating memory to array
        for(int i=0; i<limit; i++) 						//populating the array with elements present in the textfile from line 3 till last{
            arr[i]= Double.parseDouble(inp.nextLine());

        Arrays.sort(arr);

        int ans1 = BinarySearch(arr, 0, limit-1, key1);
        if(ans1 == -1)
            System.out.println("Element is not Found.");
        else
            System.out.println("Element is Found, at position : " + ans1);

        int ans2 = BinarySearch(arr, 0, limit-1, key2);
        if(ans2 == -1)
            System.out.println("Element is not Found.");
        else
            System.out.println("Element is Found, at position : (the position of the element is change due to sorted the array)" + ans2);

    }//end of main



} // end of class