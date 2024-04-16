package com.wpi.hw3;

public class A {
    public static int f1(int x) {
        x = x + 1;
        return x;
    }

    static int f2(int x) {
        x = x + 2;
        return x;
    }

    protected static int f3(int x) {
        x = x + 3;
        return x;
    }

    private static int f4(int x) {
        x = x + 4;
        return x;
    }

    public static double f5(int x, int y) {
        return (double) x / y;
    }

    public static int f6(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("x can't be negative");
        }

        return x + 5;
    }

    public static String f7(String s) {
        String ss = s + " more stuff";
        return ss;
    }

    public int f8(int x) {
        // Assume this calls a SQL database such as "select * from where something = x"
        return x + 8;
    }
}