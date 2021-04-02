package com.epam.test.automation.java.practice14.advanced.task15;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task15 {
    private Task15() {

    }

    public static List<CountryStat> name(List<Good> goodList, List<StorePrice> storePriceList) {

        return goodList
                .stream()
                .map(c -> new CountryStat(c.getCountryOfOrigin(),
                        storePriceList
                                .stream()
                                .filter(s -> s.getProductSKU() == c.getProductSKU())
                                .count(),
                        storePriceList
                                .stream()
                                .filter(s -> s.getProductSKU() == c.getProductSKU())
                                .map(StorePrice::getPrice)
                                .min(Comparator.comparing(BigDecimal::intValue))
                                .orElse(BigDecimal.valueOf(0))))
                .sorted(Comparator.comparing(CountryStat::getCountryOfOrigin))
                .collect(Collectors.toList());

    }


}
