
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition1() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.addition(2, 3));
    }
    @Test
    public void testSoustraction() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.soustraction(3, 2));
    }

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiplication(2, 3));
    }

    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(2.0, calc.division(6, 3));
    }
    @Test
    public void testDivision2(){
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.division(1, 0));
    }


}
