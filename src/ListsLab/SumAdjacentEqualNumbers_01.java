package ListsLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arrayInput = input.split(" ");

        List<Double> numbers = new ArrayList<>();

        for (String number : arrayInput) {
            numbers.add(Double.parseDouble(number));
        }


        List<Double> nextNumbers = sumAdjacentEqualNumbers(numbers);
        while (nextNumbers.size() != numbers.size()) {
            numbers = nextNumbers;
            nextNumbers = sumAdjacentEqualNumbers(numbers);
        }
        numbers = nextNumbers;

        for (Double number : numbers) {
            System.out.print(new DecimalFormat("0.#").format(number) + " ");
        }

    }

    private static List<Double> sumAdjacentEqualNumbers(List<Double> numbers) {
        List<Double> nextNumbers = new ArrayList<>();
        int i = 0;
        while (i < numbers.size()){
            if (i < numbers.size() - 1 && numbers.get(i).equals(numbers.get(i + 1))){
                nextNumbers.add(numbers.get(i) + numbers.get(i + 1));
                i += 2;
            } else {
                nextNumbers.add(numbers.get(i));
                i++;
            }
        }
        return nextNumbers;
    }
}
