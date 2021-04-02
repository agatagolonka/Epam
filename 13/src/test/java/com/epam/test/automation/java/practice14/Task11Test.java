package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;
import com.epam.test.automation.java.practice14.advanced.task11.Task11;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task11Test {
    List<Entrant> testList = List.of(new Entrant(1, 1993, "Ivanov"),
            new Entrant(2, 1992, "Petrov"),
            new Entrant(3, 1993, "Pupkin"),
            new Entrant(3, 2000, "Zobkin"),
            new Entrant(3, 2000, "Zabkin"));
    List<YearSchoolStat> resultList = List.of(
            new YearSchoolStat(1992, 1),
            new YearSchoolStat(2000, 1),
            new YearSchoolStat(1993, 2)
    );

    @Test
    public void testTask9() {
        Assert.assertEquals(Task11.getYearSchoolStats(testList), resultList);

    }
}
