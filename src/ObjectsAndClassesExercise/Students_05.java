package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));
            studentList.add(student);
        }
        System.out.println();
        studentList.stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(student -> System.out.println(student.toString()));


    }

    static class Student {
        //"{first name} {second name} {grade}
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", firstName,lastName, grade);
        }
    }
}
