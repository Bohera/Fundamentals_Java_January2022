package TextProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = "aisndas njdajsjnsda nnwenqnqs nsn nsnsaqnq n nqwnwnqwnnqw";
        String separator = " ";
        List<String> split = new ArrayList<>();
        int lastIndex = 0;
        int index = text.indexOf(separator);

        while (index != -1) {
            split.add(text.substring(lastIndex, index));
            lastIndex = index + separator.length();
            index = text.indexOf(separator, lastIndex);
        }
        split.add(text.substring(lastIndex));
        for (String word : split) {
            System.out.println(word);
        }
    }
}
