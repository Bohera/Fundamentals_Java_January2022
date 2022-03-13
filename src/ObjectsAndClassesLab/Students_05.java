package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Student> students = new ArrayList<>();
        while (!line.equals("end")) {
            String[] studentData = line.split("\\s+");
            Student student = new Student(studentData[0], studentData[1], studentData[2], studentData[3]);
            students.add(student);
            line = scanner.nextLine();
        }
        String city = scanner.nextLine();
        students.stream()
                .filter(student -> student.getHomeTown().equals(city))
                .forEach(student -> System.out.println(student.toString()));

    }

    static class Student {
        String firstName;
        String lastName;
        String age;
        String homeTown;

        Student(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getHomeTown() {
            return homeTown;
        }

        @Override
        public String toString() {
            return String.format("%s %s is %s years old", firstName, lastName, age);
        }
    }
}
