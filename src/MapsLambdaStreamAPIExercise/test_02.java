package MapsLambdaStreamAPIExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class test_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> phoneBook = new TreeMap<>(); // HashMap, TreeMap

        Person peter = new Person("Peter", "12345");
        Person anton = new Person("Anton", "00000");
        Person sofia = new Person("Sofia", "11111");
        phoneBook.put(peter.getName(), peter);
        phoneBook.put(anton.getName(), anton);
        phoneBook.put(sofia.getName(), sofia);


        phoneBook.forEach((key, value) -> System.out.printf("Name: %s --- Phone: %s%n", key, value.phoneNumber));

    }

    static class Person {
        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        String name;
        String phoneNumber;
        String email;

        public Person (String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

    }
}
