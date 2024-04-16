package com.wpi;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class BTest {

    @Test
    public void testG1() {
        // Create a mock A object
        A mockA = mock(A.class);
        // Define the behavior of f8 method in mockA
        when(mockA.f8(1)).thenReturn(9);

        B b = new B(mockA);
        assertEquals(9, b.g1(1));
        // Verify that f8 method in mockA is called with argument 1
        verify(mockA).f8(1);
    }
}