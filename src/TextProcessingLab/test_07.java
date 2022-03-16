package TextProcessingLab;

import java.util.Date;
import java.util.Scanner;

public class test_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(new Date());
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < 1000000000; i++) {
            text.append("a");
        }
        System.out.println(new Date());

    }
}
