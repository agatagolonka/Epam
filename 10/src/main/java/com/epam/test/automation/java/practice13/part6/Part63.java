package com.epam.test.automation.java.practice13.part6;

import java.util.*;
import java.util.stream.Collectors;

public class Part63 {
    List<String> resultList;

    public Part63(List<String> fileToParsing) {
        this.resultList = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String word : fileToParsing) {
            Integer oldCount = map.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            map.put(word, oldCount + 1);
        }
        List<Map.Entry<String, Integer>> list = map.entrySet().stream()
                .collect(Collectors.toList());


        int howMuch = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue() > 1 && !list.get(i).getKey().equals("") && !list.get(i).getKey().equals(" ")) {
                StringBuilder reversedString = new StringBuilder();
                reversedString = reversedString.append(list.get(i).getKey()).reverse();
                resultList.add(String.valueOf(reversedString).toUpperCase(Locale.ROOT));
                howMuch++;
            }
            if (howMuch == 3) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            result.append(resultList.get(i) + "\n");
        }
        return result.toString().trim();

    }


}
