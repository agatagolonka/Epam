package com.epam.test.automation.java.practice13.part6;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Part61 {

    private List<Map.Entry<String, Integer>> resultList;


    public Part61(List<String> fileToParsing) {

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String word : fileToParsing) {
            Integer oldCount = map.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            map.put(word, oldCount + 1);
        }


        List<Map.Entry<String, Integer>> result = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toList());


        this.resultList = result;

    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            result.append(resultList.get(i).getKey() + " ==> " + resultList.get(i).getValue() + "\n");
        }
        return result.toString().trim();

    }
}
