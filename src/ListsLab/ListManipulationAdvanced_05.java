package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] data = command.split("\\s+");
            String dataIndexZero = data[0];
            String dataIndexOne = data[1];

            switch (dataIndexZero) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(dataIndexOne))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (dataIndexOne) {
                        case "even":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 == 0) {
                                    System.out.print(numbers.get(i));
                                    if (i < numbers.size() - 1) {
                                        System.out.print(" ");
                                    }
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 != 0) {
                                    System.out.print(numbers.get(i));
                                    if (i < numbers.size() - 1) {
                                        System.out.print(" ");
                                    }
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int dataIndexTwo = Integer.parseInt(data[2]);
                    switch (dataIndexOne) {
                        case "<":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) < dataIndexTwo) {
                                    System.out.print(numbers.get(i));
                                    if (i < numbers.size() - 1) {
                                        System.out.print(" ");
                                    }
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) > dataIndexTwo) {
                                    System.out.print(numbers.get(i));
                                    if (i < numbers.size() - 1) {
                                        System.out.print(" ");
                                    }
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) >= dataIndexTwo) {
                                    System.out.print(numbers.get(i));
                                    if (i < numbers.size() - 1) {
                                        System.out.print(" ");
                                    }
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) <= dataIndexTwo) {
                                    System.out.print(numbers.get(i));
                                    if (i < numbers.size() - 1) {
                                        System.out.print(" ");
                                    }
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }

            command = scanner.nextLine();
        }

    }
}
