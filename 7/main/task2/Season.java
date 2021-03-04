package com.epam.test.automation.java.practice10.task2;




    final class Season {
    private static Season[] seasons = {new Season("SPRING") ,
            new Season("SUMMER") ,
            new Season("AUTUMN") ,
            new Season("WINTER")};
    private String name;
    private Season(String name) {
        this.name = name;
    }
    public String name() {
        return this.name;
    }
    public int ordinal() {
        for (int i = 0; i < seasons.length; i++)
            if (seasons[i].name.equals(this.name)) return i;
        throw new IllegalArgumentException();
    }
    public String toString() {
        return name;
    }
    public static Season[] values() {
        return seasons.clone();
    }
    public static Season valueOf(String name) {
        for (int i = 0; i < seasons.length; i++)
            if (name.equals(seasons[i].name)) return seasons[i];
        throw new IllegalArgumentException();
    }
    public int compareTo(Season other) {
        Integer another = this.ordinal();
        return another.compareTo(other.ordinal());
    }
}