package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<>(Arrays.asList("abc", "def", "abc", "abc", "def"));

        removeAll(words, "abc");

        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    private static void removeAll(List<String> elements, String value) {
        //while (elements.remove(value));
        //for (int i = 0; i < elements.size(); i++) {
        //    while (elements.get(i).equals(value)){
        //       elements.remove(i);
        //    }
        //}

//        int i = 0;
//        while (i < elements.size()) {
//            if (elements.get(i).equals(value)) {
//                elements.remove(i);
//            } else {
//                i++;
//            }
//        }
        int i = elements.size() - 1;
        while (i >= 0) {
            if (elements.get(i).equals(value)) {
                elements.remove(i);
            }
            i--;
        }

    }
}
