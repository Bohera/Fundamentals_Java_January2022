package MapsLambdaStreamAPIExercise;

import java.util.*;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] courseInfo;
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {
            courseInfo = input.split(" : ");
            String courseName = courseInfo[0];
            String student = courseInfo[1];

            courses.putIfAbsent(courseName, new ArrayList<>());
            courses.get(courseName).add(student);

            input = scanner.nextLine();
        }

        courses.forEach((key, value) -> {
            System.out.printf("%s: %d%n", key, courses.get(key).size());
            for (int i = 0; i < courses.get(key).size(); i++) {
                System.out.printf("-- %s%n", courses.get(key).get(i));
            }
        });
    }
}
