package com.epam.test.automation.java.practice14.advanced.task14;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task14 {
    private Task14() {

    }

    public static List<ShopWithMaxDiscountOwner> getShopsWithMaxDiscountOwners(List<Supplier> supplierList, List<SupplierDiscount> supplierDiscountList) {

        return supplierDiscountList.stream().collect(Collectors.toMap(SupplierDiscount::getStoreName, Function.identity(),
                BinaryOperator.maxBy(Comparator.comparing(SupplierDiscount::getDiscountPercentage))))
                .entrySet().stream()
                .map(n -> new ShopWithMaxDiscountOwner(n.getKey(), supplierList
                        .stream()
                        .filter(s -> s.getCustomerId() == n.getValue().getCustomerId())
                        .findFirst().orElse(new Supplier(0, 0, "0"))))
                .sorted(Comparator.comparing(ShopWithMaxDiscountOwner::getStoreName))
                .collect(Collectors.toList());


    }

}
