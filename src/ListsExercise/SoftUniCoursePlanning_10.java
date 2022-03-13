package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lessonsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String[] commandsData = command.split(":");
            int ifExists = -1;
            switch (commandsData[0]) {
                case "Add":
                    ifExists = checkIfExists(lessonsList, commandsData[1]);
                    if (ifExists == -1) {
                        lessonsList.add(commandsData[1]);
                    }
                    break;
                case "Insert":
                    ifExists = checkIfExists(lessonsList, commandsData[1]);
                    if (ifExists == -1) {
                        lessonsList.add(Integer.parseInt(commandsData[2]), commandsData[1]);
                    }
                    break;
                case "Remove":
                    lessonsList.remove(commandsData[1]);
                    lessonsList.remove(commandsData[1] + "-Exercise");
                    break;
                case "Swap":
                    int firstLessonIfExists = checkIfExists(lessonsList, commandsData[1]);
                    int secondLessonIfExists = checkIfExists(lessonsList, commandsData[2]);
                    int firstExerciseExists = checkIfExists(lessonsList, commandsData[1] + "-Exercise");
                    int secondExerciseExists = checkIfExists(lessonsList, commandsData[2] + "-Exercise");
                    if (firstLessonIfExists != -1 && secondLessonIfExists != -1) {
                        String tempLessonOne = lessonsList.get(firstLessonIfExists);
                        String tempLessonTwo = lessonsList.get(secondLessonIfExists);
                        lessonsList.set(firstLessonIfExists, tempLessonTwo);
                        lessonsList.set(secondLessonIfExists, tempLessonOne);
                        if (firstExerciseExists != -1) {
                            lessonsList.remove(commandsData[1] + "-Exercise");
                            firstLessonIfExists = checkIfExists(lessonsList, commandsData[1]);
                            lessonsList.add(firstLessonIfExists + 1, commandsData[1] + "-Exercise");

                        }
                        if (secondExerciseExists != -1) {
                            lessonsList.remove(commandsData[2] + "-Exercise");
                            secondLessonIfExists = checkIfExists(lessonsList, commandsData[2]);
                            lessonsList.add(secondLessonIfExists + 1, commandsData[2] + "-Exercise");
                        }
                    }
                    break;
                case "Exercise":
                    ifExists = checkIfExists(lessonsList, commandsData[1]);
                    if (ifExists == -1) {
                        ifExists = checkIfExists(lessonsList, commandsData[1] + "-Exercise");
                        if (ifExists == -1) {
                            lessonsList.add(commandsData[1]);
                            lessonsList.add(commandsData[1] + "-Exercise");
                        }
                    } else {
                        int lessonIndex = ifExists;
                        ifExists = checkIfExists(lessonsList, commandsData[1] + "-Exercise");
                        if (ifExists == -1) {
                            lessonsList.add(lessonIndex + 1, commandsData[1] + "-Exercise");
                        }
                    }
                    break;

            }


            command = scanner.nextLine();
        }
        for (int i = 0; i < lessonsList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, lessonsList.get(i));
        }
    }

    private static int checkIfExists(List<String> lessonsList, String commandData) {
        for (int i = 0; i < lessonsList.size(); i++) {
            if (lessonsList.get(i).equals(commandData)) {
                return i;
            }
        }
        return -1;
    }
}
