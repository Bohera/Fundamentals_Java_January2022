package FinalExam03April2022;

import java.util.Scanner;

public class StringManipulator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String commandLine = scanner.nextLine();

        while (!commandLine.equals("End")) {
            String[] data = commandLine.split("\\s+");
            String command = data[0];

            switch (command) {
                case "Translate":
                    String character = data[1];
                    String replacement = data[2];
                    inputLine = inputLine.replace(character, replacement);
                    System.out.println(inputLine);
                    break;
                case "Includes":
                    String substring = data[1];
                    boolean isIncluded = inputLine.contains(substring);
                    if (isIncluded) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    substring = data[1];
                    boolean isTrue = false;
                    for (int i = 0; i < substring.length(); i++) {
                        if (substring.charAt(i) == inputLine.charAt(i)) {
                            isTrue = true;
                        } else {
                            isTrue = false;
                            break;
                        }
                    }
                    if (isTrue) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    inputLine = inputLine.toLowerCase();
                    System.out.println(inputLine);
                    break;
                case "FindIndex":
                    character = data[1];
                    int lastIndexOfCharacter = inputLine.lastIndexOf(character);
                    System.out.println(lastIndexOfCharacter);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(data[1]);
                    int count = Integer.parseInt(data[2]);
                    inputLine = new StringBuilder(inputLine).replace(startIndex, (startIndex + count), "").toString();
                    System.out.println(inputLine);
                    break;
            }
            commandLine = scanner.nextLine();
        }
    }
}
