package springKafka.springKafkadocker;

public class FibPrime {
        public static boolean isPrime(int number) {

            if(number <= 1) {
                return false;
            }
            for(int i = 2; i < number/2; i++) {
                if(number % i == 0)
                    return false;
            }
            return true;
        }
        public static  boolean isPerfectSquare(int x)
        {
            int s = (int) Math.sqrt(x);
            return (s * s == x);
        }

        // Returns true if n is a Fibonacci Number, else false
        public static boolean isFibonacci(int n)
        {
            // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
            // is a perfect square
            return isPerfectSquare(5 * n * n + 4) ||
                    isPerfectSquare(5 * n * n - 4);
        }
        //Returns true if the number is prime and fibonacci
        public static boolean isFibAndPrime(int num){
            return isPrime((num)) && isFibonacci((num));
        }
        public void evaluate(int operand,String operation){
            if(operation.equals("fibonacci")){
                if(FibPrime.isFibonacci(operand))
                    System.out.println(operand+" is fibonacci");
                else
                    System.out.println(operand+" is not fibonacci");
            }
            else if(operation.equals("prime")){
                if(FibPrime.isPrime(operand))
                    System.out.println(operand+" is prime.");
                else
                    System.out.println(operand+" is not prime");
            }
            else if(operation.equals("fibPrime")){
                if(FibPrime.isFibAndPrime(operand))
                    System.out.println(operand+" is prime and fibonacci");
                else
                    System.out.println(operand+" is not prime and fibonacci");
            }
            else {
                System.out.println("operand: " + operand);
                System.out.println(("operation: " + operation));
            }
        }
}
