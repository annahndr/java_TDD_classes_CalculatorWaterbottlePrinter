import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void addsTwoNumbers(){
    assertEquals(12, calculator.add(5, 7));
    }

    @Test
    public void subtractsTwoNumbers(){
        assertEquals(6, calculator.subtract(16, 10));
    }

    @Test
    public void multiplyTwoNumbers(){
        assertEquals(56, calculator.multiply(7, 8));
    }

    @Test
    public void divideTwoNumbers(){
        assertEquals(5, calculator.divide(40, 8));
    }
}
