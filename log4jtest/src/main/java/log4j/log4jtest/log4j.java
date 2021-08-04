package log4j.log4jtest;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class log4j {

    static boolean isPrime(int n){  
    	int i,m=0;
		boolean flag=false;      
		m=n/2;      
		if(n<=1){  
    	   return flag;
    	   }
		else{  
    	   for(i=2;i<=m;i++){      
    	    if(n%i!=0){          
    	     flag=true;         
    	     }
    	    else
    	    	flag=false;
    	    }      
    	   } 
    	  return flag;
    	}  
    static  boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
      
    // Returns true if n is a Fibonacci Number, else false
    static boolean isFibonacci(int n)
    {
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5*n*n + 4) ||
               isPerfectSquare(5*n*n - 4);
    }
    public static void main(final String... args) {
        Logger logger = LogManager.getLogger();
        // Set up a simple configuration that logs on the console.
 
        logger.trace("Entering application.");
        int i=0;
        while(i<1000) {
        	if(isFibonacci(i)==true && isPrime(i)==true)
        		System.out.println(i+" is prime and fibonacci number");
        	else
        		logger.debug("Debug log");
        	i++;
        }
        logger.trace("Exiting application.");
    }
}
