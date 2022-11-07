package org.example.j;

public class MathsDigit {

    public Double checkDigits(int val) {
        double soma = 0;
        String vall = Integer.toString(val);
        for (int i = 0; i < vall.length(); i++) {
            soma += Integer.parseInt("" + vall.charAt(i));
        }
        return soma / vall.length();
    }
}
