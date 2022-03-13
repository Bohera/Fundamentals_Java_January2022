package ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = new ArrayList<String>();
        wordsList.add("swedish");
        wordsList.add("vegans");
        wordsList.add("marching");
        wordsList.add("ashore");

        System.out.println(wordsList.get(0));
        wordsList.set(1, "pagans");

        for (int i = 0; i < wordsList.size(); i++) {
            System.out.println(wordsList.get(i));
        }

        String[] words = new String[4];
        words[0] = "swedish";
        words[1] = "vegans";
        words[2] = "marching";
        words[3] = "ashore";

        System.out.println(words[0]);
        words[1] = "pagans";

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
