package com.epam.test.automation.java.practice13.part4;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Range implements Iterable<Integer> {

    List<Integer> listOfNumbers;
    int position;


    public Range(int n, int m) {
        this(n, m, false);
    }

    public Range(int firstBound, int secBound, boolean reversedOrder) {
        if (reversedOrder) {

            listOfNumbers = IntStream.iterate(secBound, i -> i - 1)
                    .limit(secBound - firstBound + 1)//NOSONAR
                    .boxed()
                    .collect(Collectors.toList());
        } else {
            listOfNumbers = IntStream.rangeClosed(firstBound, secBound)
                    .boxed()
                    .collect(Collectors.toList());
        }


    }

    @Override
    public Iterator<Integer> iterator() {
        position = -1;
        return new IteratorImpl();

    }

    private final class IteratorImpl implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            if (listOfNumbers.size() > (position + 1)) return true;//NOSONAR

            return false;
        }

        @Override
        public Integer next() {//NOSONAR
            position++;
            return listOfNumbers.get(position);
        }

    }

}
