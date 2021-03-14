package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {

    public static List<String> getSortedAscOddValues(List<Integer> intList) {

        return intList.stream().filter(n->n%2==1).sorted().map(n->Integer.toString(n)).collect(Collectors.toList());
    }

}
