public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1,10.2,12,3,23};
        double results = 0;
        int i;
        for (i =0; i<5;i++){
            results = results + nums[i];
        }
        System.out.println("Average is "+results/5);

    }
}
