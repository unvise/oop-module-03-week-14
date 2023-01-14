package com.unvise.oop;

import com.unvise.oop.stack.Stack;
import com.unvise.oop.stack.StackImpl;

public class StackDemoApp {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new StackImpl<>(3);
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        System.out.println(integerStack);
        while (!integerStack.isEmpty()) {
            System.out.println("Вытащенное значение - ".concat(integerStack.pop().toString()));
        }
        System.out.println("Стек пустой");
    }
}
