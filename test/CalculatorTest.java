import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        int result = Calculator.add(55,55);
        assertEquals(110,result);
    }

    @org.junit.jupiter.api.Test
    void sub() {
        int result = Calculator.sub(55,55);
        assertEquals(0,result);
    }

    @org.junit.jupiter.api.Test
    void mult() {
        int result = Calculator.mult(55,55);
        assertEquals(3025,result);
    }

    @org.junit.jupiter.api.Test
    void div() {
        float result = Calculator.div(55,55);
        assertEquals(1,result);
    }
}