package FinalExamPreparationMoreProblems28March2022;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Travel")) {
            String[] data = commandLine.split(":");
            String command = data[0];
            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(data[1]);
                    String stop = data[2];
                    if (index >= 0 && index < stops.length()) {
                        stops.insert(index, stop);
                    }
                    System.out.println(stops);
                    break;
                case "Remove Stop":
                    int indexStart = Integer.parseInt(data[1]);
                    int indexEnd = Integer.parseInt(data[2]);
                    if ((indexStart <= indexEnd) && indexStart >= 0 && indexStart < stops.length() && indexEnd < stops.length()) {
                        stops.delete(indexStart, indexEnd + 1);
                    }
                    System.out.println(stops);
                    break;
                case "Switch":
                    String oldString = data[1];
                    String newString = data[2];
                    if (!oldString.equals(newString) && stops.toString().contains(oldString)) {
                      String[] stopsString = stops.toString().split(oldString);
                        stops.setLength(0);
                        for (int i = 0; i < stopsString.length; i++) {
                            if (i < stopsString.length - 1) {
                                stops.append(stopsString[i] + newString);
                            } else {
                                stops.append(stopsString[i]);
                            }
                        }
                    }
                    System.out.println(stops);
                    break;
            }
            commandLine = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }
}
