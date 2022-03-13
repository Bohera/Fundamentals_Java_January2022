package ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = nextLineOfNumbers(scanner);


//        for (int i = 0; i < numbersAsStrings.length; i++) {
//            numbers.add(Integer.parseInt(numbersAsStrings[i]));
//        }
        for (int number : numbers) {
            System.out.println(number);
        }

    }

    private static List<Integer> nextLineOfNumbers(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsStrings = lineOfNumbers.split(" ");
        for (String s : numbersAsStrings) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }
}
