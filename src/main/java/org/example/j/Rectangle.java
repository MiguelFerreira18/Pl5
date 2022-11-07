package org.example.j;

public class Rectangle {

    public int area(int base, int altura) {
        return base * altura;
    }

    public int perimetro(int base, int altura) {
        return base + base + altura + altura;
    }

    public boolean isTriangle(int a, int b, int c) {

        if (a + b > c) {
            return true;
        } else if (a + c > b) {
            return true;
        } else if (c + b > a) {
            return true;
        }
        return false;
    }
}
