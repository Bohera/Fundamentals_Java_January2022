package MapsLambdaStreamAPILab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test_02 {
    static class Student {
        int facultyNumber;
        String name;
        int age;

        public Student(int facultyNumber, String name, int age) {
            this.facultyNumber = facultyNumber;
            this.name = name;
            this.age = age;
        }

        public int getFacultyNumber() {
            return facultyNumber;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int digit = scanner.nextInt();

        //String[] digitNames = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        String digitName = scanner.nextLine();
        Map<String, Integer> digitValues = new HashMap<>(); //LinkHashMap sa podredeni kakto sa vuvedeni inache sa razburkani
        digitValues.put("zero", 0);                         //TreeMap e podredeno po key order, ako e String po azbuchen red
        digitValues.put("one", 1);
        digitValues.put("two", 2);
        digitValues.put("three", 3);

        System.out.println(digitValues.containsKey("one"));

        Integer result = digitValues.get("one");
        if (result != null) {
            System.out.println("yes" + result);
        } else {
            System.out.println("no");
        }

        System.out.println(digitValues.get(digitName));

        for (Map.Entry<String, Integer> entry : digitValues.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }


    }
}
