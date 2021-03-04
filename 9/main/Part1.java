package com.epam.test.automation.java.practice12;
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Part1 {

    public static void main(String[] args) {
        String input = Util.getInput("part1.txt");

        System.out.println(Part1.convert1(input));
        System.out.println(Part1.convert2(input));
        System.out.println(Part1.convert3(input));
        System.out.println(Part1.convert4(input));

    }

    public static String convert1(String input) {

        String result="";
        input=input.replaceAll(";.*;", ":");
        String regex = "(\\w+):(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)?";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(input);
        while (m2.find()) {
            result=result.concat(m2.group()+"\n");
        }
        result=result.replaceAll(":", ": ");

        return result;
}

    public static String convert2(String input) {
        String result="";

        final String regex = " \\w*";
        final String regex2 = "\\w* ";
        String regex3 = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)?";
        Pattern p1 = Pattern.compile(regex,Pattern.MULTILINE);
        Matcher m1 = p1.matcher(input);
        Pattern p2 = Pattern.compile(regex2,Pattern.MULTILINE);
        Matcher m2 = p2.matcher(input);
        Pattern p3 = Pattern.compile(regex3,Pattern.MULTILINE);
        Matcher m3 = p3.matcher(input);
        while (m1.find()&&m2.find()&&m3.find()) {
            result=result.concat(m1.group().replaceAll(" ", "")+" "+m2.group()+"(email: "+m3.group()+")\n");
        }
        return result;
    }

    public static String convert3(String input) {

        String result1="mail.com ==> ";
        String result2="google.com ==> ";
        String regex="^[a-z]*";
        String regexmail="mail.com";
        String regexgoogle="google.com";
        Pattern p = Pattern.compile(regex,Pattern.MULTILINE);
        Matcher m;
        Pattern pmail = Pattern.compile(regexmail);
        Pattern pgoogle = Pattern.compile(regexgoogle,Pattern.MULTILINE);

        Matcher m2;
        Matcher m1;
        String tmp;

        try (Scanner sc = new Scanner(input)){

            System.out.println("Błąd odczytu danych");

            while (sc.hasNextLine()) {

                tmp = sc.nextLine();
                m1 = pmail.matcher(tmp);
                if (m1.find()) {
                    m = p.matcher(tmp);
                    if (m.find()) {
                        result1 = result1.concat(m.group() + ", ");
                    }
                }
            }
        }

        result1=result1.substring(0, result1.length()-2);
        try (Scanner sc2= new Scanner(input)){

        while (sc2.hasNextLine()) {
            tmp=sc2.nextLine();
            m2= pgoogle.matcher(tmp);
            if(m2.find()) {
                m=p.matcher(tmp);
                if(m.find()) {
                    result2 = result2.concat(m.group()+", ");
                }
            }
        }
        }
        result2=result2.substring(0, result2.length()-2);

        return result1.concat("\n"+result2+"\n");
    }

    public static String convert4(String input) {
        String result="";
        String regex = "^.*@(\\w+)(\\.\\w+)?";
        Pattern p = Pattern.compile(regex,Pattern.MULTILINE);
        Matcher m = p.matcher(input);
        int i;
        while (m.find()) {
            i=new SecureRandom().nextInt(9999-1000)+1000;
            result=result.concat(m.group()+";"+i+"\n");
        }

        return result;
    }
}
