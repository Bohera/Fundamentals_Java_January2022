package FinalExamPreparationMoreProblems28March2022;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Generate")) {
            String[] data = commandLine.split(">>>");
            String command = data[0];
            switch (command) {
                case "Contains":
                    if (inputLine.contains(data[1])) {
                        System.out.printf("%s contains %s%n", inputLine, data[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    if (data[1].equals("Upper")) {
                        String substring = inputLine.substring(Integer.parseInt(data[2]),Integer.parseInt(data[3]));
                        String toUpperCase = substring.toUpperCase();
                        inputLine = inputLine.replace(substring, toUpperCase);
                        System.out.println(inputLine);
                    } else if (data[1].equals("Lower")) {
                        String substring = inputLine.substring(Integer.parseInt(data[2]),Integer.parseInt(data[3]));
                        String toLowerCase = substring.toLowerCase();
                        inputLine = inputLine.replace(substring, toLowerCase);
                        System.out.println(inputLine);
                    }
                    break;
                case "Slice":
                    String toDelete = inputLine.substring(Integer.parseInt(data[1]),Integer.parseInt(data[2]));
                    inputLine = inputLine.replace(toDelete, "");
                    System.out.println(inputLine);
                    break;


            }
            commandLine = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",inputLine);
    }
}
