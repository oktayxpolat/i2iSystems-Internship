public class Fibonacci {
    //Execution time calculation method
    public static void calculateTime(long start) {
        long execution = System.nanoTime() - start;
        System.out.println("Time: "+ execution);
    }

    public static int memoization(int n,int[] nums) {

        if (n < 2)
            return n;
        if (nums[n] != 0)
            return nums[n];
        return nums[n] = memoization(n - 1,nums) + memoization(n - 2,nums);
        }

    public static int bottomUp(int n) {
            int[] nums = new int[n + 2];
            nums[0] = 0;
            nums[1] = 1;

            for (int i = 2; i <= n; i++)
                nums[i] = nums[i - 1] + nums[i - 2];

            return nums[n];
        }

    // Returns true if n is a Fibonacci Number, else false
    public static int longApproach(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main (String args[]){
        int num=15;
        long start;
        start=System.nanoTime();
        System.out.println("Long Approach: "+longApproach(num));
        calculateTime(start);

        start=System.nanoTime();
        System.out.println("Memoization: "+memoization(num,new int[num+1]));
        calculateTime(start);

        start=System.nanoTime();
        System.out.println("Bottom up: "+bottomUp(num));
        calculateTime(start);
    }
}
