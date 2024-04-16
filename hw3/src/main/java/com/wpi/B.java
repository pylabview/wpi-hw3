package com.wpi;

public class B {
    private final A a;

    B(A a) {
        this.a = a;
    }

    int g1(int x) {
        return a.f8(x);
    }
}
