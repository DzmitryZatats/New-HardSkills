package by.zayats.Exceptions;

public class Exception1 {
    double difNumbers(int a, int b) {
        double result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero " + e);
        }

        return result;
    }
}
