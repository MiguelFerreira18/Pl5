package org.example.j;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsDigitTest {
    MathsDigit md;
    @BeforeEach
    public void setup(){
        md = new MathsDigit();
    }

    @Test
    void checkDigitsTest() {
        int val = 111;
        int num = 1;
        double  media = md.checkDigits(val);
        assertEquals(1,media, "vÊ lá");
    }
}