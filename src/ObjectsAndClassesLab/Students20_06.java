package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students20_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Student> students = new ArrayList<>();
        while (!line.equals("end")) {
            String[] studentData = line.split("\\s+");
            String firstName = studentData[0];
            String lastName = studentData[1];
            String age = studentData[2];
            String homeTown = studentData[3];

            if (isStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(homeTown);

            } else {
                Student student = new Student(firstName, lastName, age, homeTown);
                students.add(student);
            }
            line = scanner.nextLine();
        }
        String city = scanner.nextLine();
        students.stream()
                .filter(student -> student.getHomeTown().equals(city))
                .forEach(student -> System.out.println(student.toString()));

    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;

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

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        @Override
        public String toString() {
            return String.format("%s %s is %s years old", firstName, lastName, age);
        }
    }
}
