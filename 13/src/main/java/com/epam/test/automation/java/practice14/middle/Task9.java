package com.epam.test.automation.java.practice14.middle;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Task9 {
    private Task9() {

    }

    public static List<String> shouldReturnStringListWithLengthAndFirstLetter(List<String> stringList) {

        return stringList.stream()
                .collect(Collectors
                        .groupingBy(n -> n.charAt(0), Collectors
                                .summingInt(String::length)))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))

                .map(n -> n.getValue().toString().concat("-").concat(n.getKey().toString())).collect(Collectors.toList());

    }


}
