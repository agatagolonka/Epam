package com.epam.test.automation.java.practice13.part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordContainer {
    public static ArrayList<Word> wordArrayList;//NOSONAR
    List<Word> sortedList;

    public WordContainer() { this.wordArrayList=new ArrayList<>();//NOSONAR

    }

    public static void main(String[] args) {
        WordContainer wc = new WordContainer();
        Scanner scanner = new Scanner(System.in);
        String startString = "";
        String allStrings = "";
        while (!"stop".equalsIgnoreCase(startString = scanner.next())) {
            allStrings = allStrings.concat(startString);
            allStrings = allStrings.concat(" ");
        }

        String[] parsedArray = allStrings.split(" ");

        for (var ar : parsedArray) {
            Word toAdd = new Word(ar);
            wc.put(toAdd);

        }
        wc.sortedArray();
        System.out.println(wc.toString());


    }

    public Word put(Word toAdd) {
        if (wordArrayList.contains(toAdd)) {
            for (Word w : wordArrayList) {
                if (w.compareTo(toAdd) == 0) {
                    w.setFrequency(1);
                }
            }
        } else
            wordArrayList.add(toAdd);
        return toAdd;
    }

    public List<Word> sortedArray() {
        sortedList = wordArrayList.stream()

                .sorted(Comparator.comparingInt(Word::getFrequency).reversed().thenComparing(Word::getContent))
                .collect(Collectors.toList());

        return sortedList;
    }

    @Override
    public String toString() {
        StringBuilder listString = new StringBuilder();
        for (Word s : sortedList) {
            listString.append(s).append("\n");
        }


        listString.delete(listString.length() - 1, listString.length());
        return listString.toString();
    }


}
