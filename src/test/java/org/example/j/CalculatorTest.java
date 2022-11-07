package org.example.j;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
Calculator calc;
    @BeforeEach
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    @DisplayName("testeSoma")
    void somaTest() {
        int val1 = 1;
        int val2 = 2;
        int value = calc.soma(val1, val2);
        assertEquals(3, value);

    }

    @Test
    @DisplayName("testeDif")
    void difTest() {
        int val1 = 1;
        int val2 = 2;

        int value = calc.dif(val1,val2);
        assertEquals(-1,value,"és um burro");
    }

    @Test
    @DisplayName("testeMult")
    void multTest() {
        int val1 = 1;
        int val2 = 2;
        int value = calc.mult(val1,val2);
        assertEquals(2,value);
    }

    @Test
    @DisplayName("testeDiv")
    void divTest() {
        int val1 = 1;
        int val2 = 2;
        int m = 1/2;
        int value = calc.div(val1,val2);
        assertEquals(m,value);
    }
}