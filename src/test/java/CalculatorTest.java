
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void add() {
        assertEquals(2, calc.add(1, 1));
    }

    @Test
    public void dif() {
        assertEquals(4, calc.dif(5, 1));
    }

    @Test
    public void div() {
        assertThrows(ArithmeticException.class, () -> calc.div(1, 0));
        assertEquals(1, calc.div(1, 1));
    }

    @Test
    public void times() {
        assertEquals(0, calc.times(1, 0));
        assertEquals(-1, calc.times(-1, 1));
        assertEquals(10, calc.times(2, 5));
    }

    @Test
    public void solver() {
        assertEquals(-19, calc.solver());
    }
}