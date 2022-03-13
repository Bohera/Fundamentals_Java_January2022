package MidExamFeb2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckOfCards_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cardsList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split(", ");

            int ifExists;

            switch (command[0]) {
                case "Add":
                    ifExists = checkIfExists(cardsList, command[1]);
                    if (ifExists == -1) {
                        cardsList.add(command[1]);
                        System.out.println("Card successfully added");
                    } else {
                        System.out.println("Card is already in the deck");
                    }
                    break;
                case "Remove":
                    ifExists = checkIfExists(cardsList, command[1]);
                    if (ifExists != -1) {
                        cardsList.remove(ifExists);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int index = Integer.parseInt(command[1]);
                    if (0 <= index && index < cardsList.size()) {
                        cardsList.remove(index);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    index = Integer.parseInt(command[1]);
                    if (0 <= index && index < cardsList.size()) {
                        ifExists = checkIfExists(cardsList, command[2]);
                        if (ifExists == -1) {
                            cardsList.add(index, command[2]);
                            System.out.println("Card successfully added");
                        } else {
                            System.out.println("Card is already added");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }
        for (int i = 0; i < cardsList.size(); i++) {
            System.out.print(cardsList.get(i));
            if (i < cardsList.size() - 1){
                System.out.print(", ");
            }
        }
    }

    private static int checkIfExists(List<String> cardsList, String command) {
        for (int i = 0; i < cardsList.size(); i++) {
            if (cardsList.get(i).equals(command)) {
                return i;
            }
        }
        return -1;
    }
}
