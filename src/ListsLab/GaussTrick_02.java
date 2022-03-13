package ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsStrings = lineOfNumbers.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numbersAsStrings.length; i++) {
            numbers.add(Integer.parseInt(numbersAsStrings[i]));
        }
        int indexFirst = 0;
        int indexLast = numbers.size() - 1;
        List<Integer> bufferList = new ArrayList<>();

        while (indexFirst < numbers.size() / 2) {
                bufferList.add(numbers.get(indexFirst) + numbers.get(indexLast));
                indexFirst++;
                indexLast--;
            }
        if (numbers.size() % 2 != 0) {
            bufferList.add(numbers.get(numbers.size() / 2));
        }

        for (int i = 0; i < bufferList.size(); i++) {
            System.out.print(bufferList.get(i) + " ");
        }

    }
}
