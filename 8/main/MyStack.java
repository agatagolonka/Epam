package com.epam.test.automation.java.practice11;

import java.util.Stack;
public class MyStack<E> implements AStack<E> {
    private final Stack<E> eStack = new Stack<E>();


    @Override
    public boolean empty() {
        return eStack.empty();
    }
    @Override
    public E peek() {
            if(eStack.empty()){
                return null;
            }
            else{
                return eStack.peek();
            }
    }
    @Override
    public E pop() {
        if(eStack.empty()){
            return null;
        }
        else {
            return eStack.pop();
        }
    }
    @Override
    public E push(Object element) {
        return eStack.push((E) element);
    }
    @Override
    public int search(Object element) {
        return eStack.search(element);
    }
}
