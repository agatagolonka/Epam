package com.epam.test.automation.java.practice14.advanced.task13;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task13 {
    private Task13() {

    }

    public static List<YearSchoolStat> getYearSchoolStatList(List<Entrant> nameList, List<Integer> yearList) {

        List<YearSchoolStat> tmpList = nameList.stream()
                .map(n -> new YearSchoolStat(n.getYearOfEntering(), n.getSchoolNumber()))
                .distinct()
                .collect(Collectors.groupingBy(n -> n.getYearOfEntering(), Collectors//NOSONAR
                        .counting())).entrySet()
                .stream()
                .map(n -> new YearSchoolStat(n.getKey(), n.getValue().intValue()))
                .sorted(Comparator
                            .comparing((YearSchoolStat::getNumberOfSchools))
                        .thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());

        return yearList.stream().map(n -> new YearSchoolStat(n, tmpList
                .stream()
                .filter(s -> n.intValue() == s.getYearOfEntering())//NOSONAR
                .map(s -> s.getNumberOfSchools())//NOSONAR
                .findFirst()
                .orElse(0)))
                .sorted(Comparator.comparing(YearSchoolStat::getNumberOfSchools).thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());
    }


}