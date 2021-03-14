package com.epam.test.automation.java.practice13.part6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part6 {
    List<String> listOfWords;

    public static List<String> readFile(String nazwa) throws IOException {

        BufferedReader plik2 = null;
        String l;
        StringBuilder result = new StringBuilder();
        List<String> myList = new ArrayList<>();
        try {//NOSONAR
            plik2 = new BufferedReader(new FileReader(nazwa));
            l = plik2.readLine();
            result.append(l).append(" ");
            myList = Arrays.asList(result.toString().split(" "));
            while (l != null) {
                l = plik2.readLine();
                result.append(l).append(" ");
                myList = Arrays.asList(result.toString().split(" "));
            }}catch (IOException e){
            System.out.println("Błąd odczytu");
            }
        finally {
            if (plik2 != null) {
                plik2.close();
            }
        }

        return myList;
    }


    public static void main(String[] args) {

        String fileName = args[1];
        String taskType = args[3];

        try {
            Part6 task1 = new Part6();
            task1.listOfWords = readFile(fileName);
            task1.delegateTask(taskType);
        } catch (Exception e) {
            e.printStackTrace();//NOSONAR
        }

    }

    public void delegateTask(String taskType) {
        if (taskType.equals("frequency")) {
            Part61 part61 = new Part61(listOfWords);
            System.out.println(part61.toString());
        } else if (taskType.equals("length")) {
            Part62 part62 = new Part62(listOfWords);
            System.out.println(part62.toString());
        } else if (taskType.equals("duplicates")) {
            Part63 part63 = new Part63(listOfWords);
            System.out.println(part63.toString());
        }
    }

}
