package ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = new ArrayList<String>();
        wordsList.add("swedish");
        wordsList.add("vegans");
        wordsList.add("marching");
        wordsList.add("ashore");

        wordsList.set(1, "pagans");

        wordsList.remove(2);

        List<String> someWords = wordsList.subList(0, 2);



        for (int i = 0; i < wordsList.size(); i++) {
            System.out.println(wordsList.get(i));
        }
    }
}
