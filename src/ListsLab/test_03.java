package ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<String>();

        String word = scanner.nextLine();

        while (!word.equals(".")) {
            words.add(word);
            word = scanner.nextLine();
        }

        for (int i = words.size() - 1; i >= 0 ; i--) {
            System.out.println(words.get(i));
        }




/*
some
text
entered
here
until
I
enter
a
dot
.
which
askpfd
dajo
adoe
sdjopa
ass
 */
    }
}
