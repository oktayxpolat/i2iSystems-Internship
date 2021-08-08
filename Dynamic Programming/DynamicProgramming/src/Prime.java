public class Prime {
    public static void sieveOfEratosthenes(int n)
    {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++)
        {
            if (prime[p])
            {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        for (int i = 2; i <= n; i++)
        {
            if (prime[i])
                System.out.print(i + " ");
        }
        System.out.print("\nsieveOfEratosthenes ");
    }
    public static void myPrime(int number) {
        int flag = 0;
        if (number <= 1) {
            flag = 0;
        }
        else {
            for (int i = 2; i <= number; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                    else
                        flag=0;
                }
                if(flag==0)
                    System.out.print(i+" ");
            }
        }
        System.out.print("\nmyPrime ");
    }
    public static void main(String[] args)
    {
        int n = 30;
        long start=System.nanoTime();
        System.out.println("Prime numbers: ");
        sieveOfEratosthenes(n);
        Fibonacci.calculateTime(start);
        start=System.nanoTime();
        myPrime(n);
        Fibonacci.calculateTime(start);
    }
}
