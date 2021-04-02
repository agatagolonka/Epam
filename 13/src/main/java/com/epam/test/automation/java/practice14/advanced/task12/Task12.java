package com.epam.test.automation.java.practice14.advanced.task12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task12 {
    private Task12() {

    }

    public static List<NumberPair> makeNumberPairsFromTwoList(List<Integer> integerList1, List<Integer> integerList2) {

        return integerList1.stream()
                .map(n -> new NumberPair(n, integerList2
                        .stream()
                        .filter(s -> s % 10 == n % 10)
                        .findFirst()
                        .orElse(635982)
                ))
                .filter(n -> n.getValue2() != 635982)
                .sorted(Comparator.comparing(NumberPair::getValue1).thenComparing(NumberPair::getValue2))
                .collect(Collectors.toList());


    }

}
