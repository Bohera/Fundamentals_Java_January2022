package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<String>(Arrays.asList("abc", "def", "abc", "def"));

        words.add("shalalal"); //на позиция size // накрая
        words.add(1, "shalalal"); //добавя на 1 и измества другите

        boolean didExist = words.remove("shalala");

        words.remove("def");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
