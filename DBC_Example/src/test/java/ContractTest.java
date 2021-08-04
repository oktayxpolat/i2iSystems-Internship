import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class ContractTest {
    @Test
    void contractTest(){
        assertTrue(Contract.checkWeight(19),"Number should be between 0-15");
    }
}
