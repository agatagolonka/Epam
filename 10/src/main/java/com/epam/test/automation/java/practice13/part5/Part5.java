package com.epam.test.automation.java.practice13.part5;

public class Part5 {

    private static final int[] TEST_ELEMENTS = {3, 5, 1, 4, 6, 2};

    public static final String OUTPUT_SEPERATOR = "~~~~~~~";


    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        for (int i : TEST_ELEMENTS) {
            tree.add(i);
        }
        tree.print();
        System.out.println(tree.add(0));
        System.out.println(tree.add(0));
        System.out.println(OUTPUT_SEPERATOR);
        tree.print();
        System.out.println(OUTPUT_SEPERATOR);
         System.out.println(tree.remove(TEST_ELEMENTS[1]));
        System.out.println(tree.remove(TEST_ELEMENTS[1]));
        System.out.println(OUTPUT_SEPERATOR);
        tree.print();
    }
    
}
