package TextProcessingLab;

import java.util.Scanner;

public class test_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //             01234567890123456789012345678901234567890
        String text = "the quick brown fox jumps over the lazy dog";

        char split = 'q';
        int splitIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == split) {
                splitIndex = i;
                break;
            }
        }
        if (splitIndex != -1) {
            String beforeSplit = text.substring(0, splitIndex);
            String afterSplit = text.substring(splitIndex);
        } else {
            System.out.println(text);
        }

        System.out.println(text.substring(4, 9));
    }
}
