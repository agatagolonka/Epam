package com.epam.test.automation.java.practice13.part5;

public class Tree<E extends Comparable<E>> {
    static final int COUNT = 2;
    private Node root;

    static void print2DUtil(Node root, int space) {
        if (root == null)
            return;

        space += COUNT;

        print2DUtil(root.left, space);

        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.data + "\n");

        print2DUtil(root.right, space);
    }

    public boolean add(E element) {//NOSONAR
        Node<E> newNode = new Node<>(element);
        if (element != null) {
            if (root == null) {
                root = newNode;
                return true;
            } else {
                Node<E> tempNode = root;
                Node<E> prev = null;
                while (tempNode != null) {
                    prev = tempNode;
                    if (element.compareTo(tempNode.data) == 0) return false;
                     else if (element.compareTo(tempNode.data) > 0) tempNode = tempNode.right;
                     else tempNode = tempNode.left;
                }
                if (element.compareTo(prev.data) < 0) {
                    prev.left = newNode;
                    return true;
                } else {
                    prev.right = newNode;
                    return true; }
            }
        } else
            return false;
    }

    public void add(E[] elements) {
        for (var el : elements) {
            add(el);
        }
    }

    public boolean contains(E value) {
        return containsNodeRecursive(root, value);
    }
    private boolean containsNodeRecursive(Node<E> current, E value) {
        if (current == null) {
            return false;
        }
        if (value.equals(current.data)) {
            return true;
        }
        return (value.compareTo(current.data)<0)
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean remove(E element) {
        if (!this.contains(element) || root == null) {
            return false;
        } else {
            root = deleteRecursive(root, element);
            return true;
        }
    }

    private Node deleteRecursive(Node<E> current, E value) {
        if (current == null) {
            return null;
        }

        if (value.compareTo(current.data) == 0) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
            Object smallestValue = findSmallestValue(current.right);
            current.data = (E) smallestValue;
            current.right = deleteRecursive(current.right, (E) smallestValue);
            return current;
        }
        if (value.compareTo(current.data) < 0) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private Object findSmallestValue(Node root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }

    public void print() {
        print2DUtil(this.root, 0);
    }


    private static final class Node<E> {
        private Node<E> left;
        private Node<E> right;
        E data;

        public Node(E element) {
            this.data = element;
        }

    }

}
