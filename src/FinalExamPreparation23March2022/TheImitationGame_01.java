package FinalExamPreparation23March2022;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder encryptedMessage = new StringBuilder(scanner.nextLine());
        String commandLine = scanner.nextLine();

        while (!commandLine.equals("Decode")) {
            String[] commandSeparation = commandLine.split("\\|");

            switch (commandSeparation[0]) {
                case "Move":
                    int lettersCount = Integer.parseInt(commandSeparation[1]);
                    int counter = 0;
                    while(counter != lettersCount) {
                        encryptedMessage.append(encryptedMessage.charAt(0));
                        encryptedMessage.deleteCharAt(0);
                        counter++;
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandSeparation[1]);
                    String value = commandSeparation[2];
                    encryptedMessage.insert(index, value);

                    break;
                case "ChangeAll":
                    int nextMatch = encryptedMessage.indexOf(commandSeparation[1]);

                    while(nextMatch != -1) {
                        encryptedMessage.replace(nextMatch, nextMatch + commandSeparation[1].length(), commandSeparation[2]);
                        nextMatch = encryptedMessage.indexOf(commandSeparation[1]);
                    }
                    break;
                default:
                    throw  new IllegalStateException("Unknown command " + commandSeparation[0]);
            }


            commandLine = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", encryptedMessage);
    }
}
