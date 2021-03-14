package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static List<String> filterAndSortByLastDigit(int number, List<String> stringList) {

        return stringList.stream().filter(n->n.length()==number).filter(n->Character.isDigit(n.charAt(n.length()-1))).sorted().collect(Collectors.toList());
    }

}