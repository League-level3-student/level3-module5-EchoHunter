package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(108, RecursionMath.recursiveMultiplication(54, 2));
        assertEquals(108, RecursionMath.recursiveMultiplication(2, 54));
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(27, RecursionMath.recursiveDivision(54, 2,1));
    	assertEquals(3, RecursionMath.recursiveDivision(9,3,1));
    	assertEquals(11, RecursionMath.recursiveDivision(121,11,1 ));
  
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
        assertEquals(4, RecursionMath.recursivePower(2, 2));
        assertEquals(161051, RecursionMath.recursivePower(11, 5));
        assertEquals(16, RecursionMath.recursivePower(2, 4));
    }
}
