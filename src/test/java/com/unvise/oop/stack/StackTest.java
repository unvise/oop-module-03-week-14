package com.unvise.oop.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void push() {
        // given
        Stack<Integer> integerStack = new StackImpl<>(2);
        // then
        assertTrue(integerStack.isEmpty());
        integerStack.push(2);
        assertFalse(integerStack.isEmpty());
    }

    @Test
    void pop() {
        // given
        Stack<Integer> integerStack = new StackImpl<>(2);
        // then
        integerStack.push(2);
        integerStack.push(1);
        assertEquals(1, integerStack.pop());
        assertEquals(2, integerStack.pop());
    }
}