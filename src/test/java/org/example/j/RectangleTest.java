package org.example.j;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rec;
    @BeforeEach
    public void setup(){
        rec = new Rectangle();
    }

    @Test
    @DisplayName("area rect")
    void areaTest() {
        Rectangle rec = new Rectangle();
        int base = 1;
        int alt = 2;
        int value = rec.area(base, alt);
        assertEquals(2, value);
        assertEquals(15,rec.area(3,5));
        assertEquals(40,rec.area(5,8));
        assertEquals(8,rec.area(2,4));
    }

    @Test
    @DisplayName("perim rect")
    void perimetroTest() {
        Rectangle rec = new Rectangle();
        int base = 1;
        int alt = 2;
        int value = rec.perimetro(base, alt);
        assertEquals(6,value );
        assertEquals(16,rec.perimetro(3,5));
        assertEquals(26,rec.perimetro(5,8));
        assertEquals(12,rec.perimetro(2,4));
    }
    @Test
    @DisplayName("check triangle")
    void isTriangleTest(){
        int a = 1;
        int b = 2;
        int c = 3;
        assertTrue(rec.isTriangle(a,b,c));
    }
}