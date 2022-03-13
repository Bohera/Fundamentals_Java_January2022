package MapsLambdaStreamAPIExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Peter", "12345");
        phoneBook.put("Peter", "+35912345");
        String phoneNumber = phoneBook.get("Peter");
        phoneBook.remove("Peter");

        System.out.println(phoneNumber);
        System.out.println(phoneBook.toString());
    }
}
