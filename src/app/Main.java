package app;

public class Main {
    static int a = 8;
    static int b = 2;
    public static void main(String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Version 1.0");
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        int e = division(a, b);
        System.out.println(e);
        int f = subtract(a, b);
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int division(int a, int b) {
        return a / b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }
}
