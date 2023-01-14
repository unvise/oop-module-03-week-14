package com.unvise.oop.stack;

public interface Stack<T> {
    void push(T t);

    T pop();

    boolean isEmpty();
}
