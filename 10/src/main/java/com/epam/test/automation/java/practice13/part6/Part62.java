package com.epam.test.automation.java.practice13.part6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Part62 {


    private final List<String> resultList;

    public Part62(List<String> fileToParsing) {

        Comparator<String> compByLength = (aName, bName) -> aName.length() - bName.length();
        this.resultList = fileToParsing.stream()
                .sorted(compByLength.reversed())
                .limit(3)
                .collect(Collectors.toList());

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            result.append(resultList.get(i) + " ==> " + resultList.get(i).length() + "\n");
        }
        return result.toString().trim();

    }

}
