package MethodsExercise;

import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Peter";
        int age = 25;

        printPersonData(name, age);
        print();
        String data = parsePersonData(name, age);
        System.out.println();
    }
    private static String parsePersonData(String name,int age) {
        String result = "";
        result = String.format("Name is: %s%nAge is: %d", name, age);
        return result;
    }

    private static void printPersonData(String name, int age) {
    System.out.printf("Name is: %s%nAge is: %d%n",name , age);
}
    private static void print() {
        System.out.println("---------");
    }
}
