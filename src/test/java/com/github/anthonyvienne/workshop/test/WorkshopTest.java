package com.github.anthonyvienne.workshop.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.github.anthonyvienne.workshopjava.Fibonacci.iterativeFibonacci;
import static com.github.anthonyvienne.workshopjava.Fibonacci.recursiveFibonacci;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class WorkshopTest {
    @Test
    public void testFibonacci() {
        ArrayList<Long> expectedValue = new ArrayList<Long>() {{
            add(0L);
            add(1L);
            add(1L);
            add(2L);
            add(3L);
            add(5L);
            add(8L);
            add(13L);
            add(21L);
            add(34L);
            add(55L);
            add(89L);
            add(144L);
            add(233L);
            add(377L);
            add(610L);
            add(987L);
            add(1597L);
            add(2584L);
            add(4181L);
            add(6765L);
            add(10946L);
            add(17711L);
            add(28657L);
            add(46368L);
            add(75025L);
            add(121393L);
            add(196418L);
            add(317811L);
            add(514229L);
            add(832040L);
            add(1346269L);
            add(2178309L);
            add(3524578L);
            add(5702887L);
            add(9227465L);
            add(14930352L);
            add(24157817L);
            add(39088169L);
            add(63245986L);
            add(102334155L);
            add(165580141L);
            add(267914296L);
            add(433494437L);
            add(701408733L);
            add(1134903170L);
            add(1836311903L);
            add(2971215073L);
            add(4807526976L);
            add(7778742049L);
        }};

        for (int i = 0; i < 50; i ++) {
            assertEquals(expectedValue.get(i), recursiveFibonacci(i));
            assertEquals(expectedValue.get(i), iterativeFibonacci(i));
            assertNotEquals(expectedValue.get(i) + 1, recursiveFibonacci(i));
            assertNotEquals(expectedValue.get(i) + 1, iterativeFibonacci(i));
        }
    }
}
