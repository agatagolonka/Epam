package com.epam.test.automation.java.practice14.advanced.task11;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task11 {
    private Task11() {

    }

    public static List<YearSchoolStat> getYearSchoolStats(List<Entrant> entrantList) {

        return entrantList.stream()
                .map(n -> new YearSchoolStat(n.getYearOfEntering(), n.getSchoolNumber()))
                .distinct()
                .collect(Collectors
                        .groupingBy(n -> n.getYearOfEntering(), Collectors//NOSONAR
                                .counting())).entrySet()
                .stream()
                .map(n -> new YearSchoolStat(n.getKey(), n.getValue().intValue()))
                .sorted(Comparator
                        .comparing((YearSchoolStat::getNumberOfSchools))
                        .thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());


    }

}
