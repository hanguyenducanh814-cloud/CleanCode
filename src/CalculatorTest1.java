import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest1 {

    @Test
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;

        int result = Calculator1.calculate(firstOperand, secondOperand, operator);

        assertEquals(expected, result);
    }

    @Test
    void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = '-';
        int expected = 1;

        int result = Calculator1.calculate(firstOperand, secondOperand, operator);

        assertEquals(expected, result);
    }

    @Test
    void testCalculateMul() {
        int firstOperand = 2;
        int secondOperand = 2;
        char operator = '*';
        int expected = 4;

        int result = Calculator1.calculate(firstOperand, secondOperand, operator);

        assertEquals(expected, result);
    }

    @Test
    void testCalculateDiv() {
        int firstOperand = 6;
        int secondOperand = 3;
        char operator = '/';
        int expected = 2;

        int result = Calculator1.calculate(firstOperand, secondOperand, operator);

        assertEquals(expected, result);
    }

    @Test
    void testCalculateDivByZero() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '/';

        assertThrows(RuntimeException.class, () -> {
            Calculator1.calculate(firstOperand, secondOperand, operator);
        });
    }
    @Test
    void testCalculateWrongOperator() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '=';

        assertThrows(RuntimeException.class, () -> {
            Calculator1.calculate(firstOperand, secondOperand, operator);
        });
    }
}