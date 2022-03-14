import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator (3, 2);
    }

    @Test
    public void hasNumA() {
        assertEquals(3, calculator.getNumA());
    }

    @Test
    public void hasNumB() {
        assertEquals(2, calculator.getNumB());
    }

    @Test
    public void add() {
        assertEquals(5, calculator.add());
    }

    @Test
    public void subtract() {
        assertEquals(1, calculator.subtract());
    }

    @Test
    public void multiply() {
        assertEquals(6, calculator.multiply());
    }

    @Test
    public void divide() {
        assertEquals(1.5, calculator.divide(), 0.0);
    }

}
