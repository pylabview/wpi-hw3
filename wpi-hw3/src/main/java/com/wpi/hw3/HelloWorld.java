package com.wpi.hw3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloWorld {
    public static void main(String[] args) {
        int v1 = A.f1(1);
        int v2 = A.f2(2);
        double v5 = A.f5(5, 2);
        int v6 = A.f6(3);
        String v7 = A.f7("hello");
        A a = new A();
        int v8 = B.g1(1, a);
    }
}