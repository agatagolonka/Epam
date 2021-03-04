package com.epam.test.automation.java.practice11;

/**
 * The AStack class represents a last-in-first-out (LIFO) stack of objects.
 *
 * @param <E> - type of elements
 */
public interface AStack<E> {

    /**
     * Tests if this stack is empty.
     *
     * @return true if and only if this stack contains no items;
     * false otherwise.
     */
    boolean empty();

    /**
     * Looks at the object at the top of this stack without
     * removing it from the stack.
     *
     * @return the object at the top of this stack
     * (the last item of the Vector object).
     */
    E peek();

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @return The object at the top of this stack
     * (the last item of the Vector object).
     */
    E pop();

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param element - the item to be pushed onto this stack.
     * @return the item argument.
     */
    E push(E element);

    /**
     * Returns the 1-based position where an object is on this stack.
     * If the object o occurs as an item in this stack, this method
     * returns the distance from the top of the stack of the occurrence
     * nearest the top of the stack; the topmost item on the stack is
     * considered to be at distance 1. The equals method is used to compare
     * o to the items in this stack.
     *
     * @param element - the desired object.
     * @return the 1-based position from the top of the stack where
     * the object is located; the return value -1 indicates that
     * the object is not on the stack.
     */
    int search(E element);
}
