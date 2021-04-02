package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task8 {
    private Task8() {

    }

    public static List<Integer> getSortedUnionTwoSubsetsIntegers(int d, int k, List<Integer> intList) {

        List<Integer> list1 = intList.stream()
                .filter(n -> n > d)
                .collect(Collectors.toList());

        return IntStream.range(k - 1, intList.size())
                .mapToObj(i -> intList.get(i))//NOSONAR
                .collect(Collectors.toList())
                .stream().filter(n -> list1.contains(n))//NOSONAR
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


    }


}
