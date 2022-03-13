package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test_01 {
    public static void main(String[] args) {
        //Student
        //name - string
        //averageScore - double

        Student st1 = new Student("Kaloyan", 5.00);
        Student st2 = new Student("Peter", 5.50);
        Student st3 = new Student("Anton", 5.75);
        Student st4 = new Student("Sofia", 6.00);


        List<Student> students = new ArrayList<>(Arrays.asList(st1, st2, st3, st4));

        st1.setName("fsjikfsakijfa");

        students.stream().sorted((s1, s2) -> Double.compare(s2.averageScore, s1.averageScore))
                .forEach(s -> System.out.println(s.getData()));

        System.out.println(st1.getAverageScore());
        Student st5 = new Student("Stefan", 5.00);
        st5.courses[0] = "Fundamentals";
        System.out.println();
    }

    static class Student {
        String name;
        double averageScore;
        String[] courses;

        //Student st1 = new Student();
        Student() {

        }

        //Student st1 = new Student("Kaloyan", 5.00);
        Student(String name, double averageScore) {
            this.name = name;
            this.averageScore = averageScore;
            this.courses = new String[5];
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAverageScore() {
            return averageScore;
        }

        public void setAverageScore(double averageScore) {
            this.averageScore = averageScore;
        }


        String getData() {
            return String.format("I am %s with avg. score: %.2f", this.name, this.averageScore);
        }
    }


}
