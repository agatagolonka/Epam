package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<String> getListExtremeLetters(List<String> list) {
        return list.stream().map(n->n.substring(0,1)+n.substring(n.length()-1,n.length())).collect(Collectors.toList());
    }


}
