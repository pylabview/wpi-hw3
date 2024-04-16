package com.wpi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ATest {

    @Test
    public void testF1() {
        assertEquals(2, A.f1(1));
    }

    @Test
    public void testF2() {
        assertEquals(4, A.f2(2));
    }

    @Test
    public void testF5() {
        assertEquals(2.5, A.f5(5, 2));
    }

    @Test
    public void testF6() {
        assertEquals(8, A.f6(3));
    }

    @Test
    public void testF7() {
        assertEquals("hello more stuff", A.f7("hello"));
    }

    @Test
    public void testF8() {
        A a = new A();
        assertEquals(9, a.f8(1));
    }
}
