package com.epam.test.automation.java.practice13.part2;

import java.util.*;

public class Part2 {

    public static final String ARRAY_LIST = "ArrayList";

    public static final String LINKED_LIST = "LinkedList";

    public static final String OUTPUT_BY_INDEX = "#Index: ";

    public static final String OUTPUT_BY_ITERATOR = "#Iterator: ";

    public static final int NUMBERS = 7;

    public static final int FREQUENCY = 3;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(NUMBERS);
        List<Integer> linkedList = new LinkedList<>();
        fillList(arrayList, NUMBERS);
        fillList(linkedList, NUMBERS);
        print(ARRAY_LIST + OUTPUT_BY_INDEX, removeByIndex(arrayList, FREQUENCY));
        print(LINKED_LIST + OUTPUT_BY_INDEX, removeByIndex(linkedList, FREQUENCY));
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        fillList(arrayList, NUMBERS);
        fillList(linkedList, NUMBERS);
        print(ARRAY_LIST + OUTPUT_BY_ITERATOR, removeByIterator(arrayList, FREQUENCY));
        print(LINKED_LIST + OUTPUT_BY_ITERATOR, removeByIterator(linkedList, FREQUENCY));
    }

    private static void print(String output, long time) {
        System.out.println(output + time + " ms");
    }

    private static void fillList(List<Integer> list, int numbers) {
        if (numbers > 0) {
            for (int i = 0; i < numbers; i++) {
                list.add(i);

            }
        } else throw new IllegalArgumentException();
    }

    public static long removeByIndex(final List<Integer> list, final int k) {
        if (k > 0 && k < list.size()) {
            final long startTime = System.nanoTime();

            int i = k;
            int index = k - 1;
            while (list.size() > 1) {

                if ((i) % k == 0) {
                    list.remove(index);
                    index--;
                }
                i++;
                index++;
                if (index == list.size()) {
                    index = 0;
                }
            }
            final long endTime = System.nanoTime();
            return (endTime - startTime);
        } else throw new NoSuchElementException();
    }

    public static long removeByIterator(final List<Integer> list, int k) {
        long start = System.currentTimeMillis();
        ListIterator<Integer> iter = list.listIterator();
        int count = 0;
        while (!list.isEmpty()) {
            if (iter.hasNext()) {
                iter.next();
                count++;
                if (count % k == 0) {
                    iter.remove();
                }
            } else {
                int newStart = iter.nextIndex() - list.size();
                iter = list.listIterator(newStart);
            }
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

}

