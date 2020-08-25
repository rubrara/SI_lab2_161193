import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyPathTest(){

        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkPrime(-1));
        assertTrue(ex.getMessage().contains("Number should not be negative"));

        assertFalse(SILab2.checkPrime(1));
        assertTrue(SILab2.checkPrime(4));
        assertFalse(SILab2.checkPrime(2));
        assertFalse(SILab2.checkPrime(5));
        assertFalse(SILab2.checkPrime(11));
    }

    @Test
    void multipleConditionTest(){

        assertFalse(SILab2.checkPrime(0));
        assertFalse(SILab2.checkPrime(1));
        assertTrue(SILab2.checkPrime(2));

    }

}