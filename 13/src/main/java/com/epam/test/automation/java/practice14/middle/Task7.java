package com.epam.test.automation.java.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {

    private Task7() {

    }

    public static List<Integer> getSortedDifferenceBetweenSubsets(int number, List<Integer> integerList) {
        Set<Integer> list1 = integerList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());

        List<Integer> list2 = integerList.subList(number, integerList.size());


        Set<Integer> list3 = list2.stream().filter(n -> list1.contains(n))//NOSONAR
                .collect(Collectors.toSet());


        return Stream.concat(list1.stream(), list2.stream()).filter(n -> !list3.contains(n))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

    }

}