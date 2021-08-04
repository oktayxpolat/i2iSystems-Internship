import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FibPrimeTest{
    @Test
    void isFibPrime(){
        int[] numbers={2,3,5}; //Tests success, returns true
        //int[] numbers={1,2,3,5,8,10}; //Test fail, returns false
        for (int i=0; i<numbers.length; i++) {
            assertTrue(FibPrime.isFibAndPrime(numbers[i]));
        }
    }
}
