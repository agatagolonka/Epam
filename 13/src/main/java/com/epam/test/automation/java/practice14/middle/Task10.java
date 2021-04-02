package com.epam.test.automation.java.practice14.middle;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task10 {
    private Task10() {

    }

    public static List<Character> getSortedLastLettersInUpperCase(List<String> stringList) {

        return stringList.stream()
                .collect(Collectors.toMap(
                        String::toUpperCase, String::length))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(n -> n.getKey().charAt(n.getKey().length() - 1)).collect(Collectors.toList());


    }

}