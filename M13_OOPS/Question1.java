package M13_OOPS;

import static M13_OOPS.ComplexNumber.*;

public class Question1 {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(3, 2);
        ComplexNumber b = new ComplexNumber(7, 5);

        ComplexNumber sum = sum(a, b);
        ComplexNumber diff = diff(a, b);
        ComplexNumber mul = mul(a, b);

        printNum(sum);
        printNum(diff);
        printNum(mul);

    }
}

class ComplexNumber {
    private int realPart, imaginaryPart;

    ComplexNumber(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    static ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        int resReal = a.realPart + b.realPart;
        int resImaginary = a.imaginaryPart + b.imaginaryPart;

        return new ComplexNumber(resReal, resImaginary);
    }

    static ComplexNumber diff(ComplexNumber a, ComplexNumber b) {
        int resReal = a.realPart - b.realPart;
        int resImaginary = a.imaginaryPart - b.imaginaryPart;

        return new ComplexNumber(resReal, resImaginary);
    }

    static ComplexNumber mul(ComplexNumber a, ComplexNumber b) {
        int resReal = (a.realPart * b.realPart) - (a.imaginaryPart * b.imaginaryPart);
        int resImaginary = (a.realPart * b.imaginaryPart) + (a.imaginaryPart * b.realPart);

        return new ComplexNumber(resReal, resImaginary);
    }

    static void printNum(ComplexNumber num) {
        String resImaginary = ((num.imaginaryPart > 0) ? ("+"+num.imaginaryPart) : String.valueOf(num.imaginaryPart))+"i";
        System.out.println(num.realPart + resImaginary);
    }
}
