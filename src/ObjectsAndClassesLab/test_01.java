package ObjectsAndClassesLab;

import java.util.Scanner;

public class test_01 {

    static class Student { //POJO Plain Old Java Object
        int id;
        String name;
        int age;

        Student(String name, int id, int age) {
            this.age = age;
            this.id = id;
            this.name = name;
        }

        String getName() {  //getters
            return this.name;
        }
        void setName(String name) {  //setters
            this.name = name;
        }

        void increaseAge() { // примерно какво може да се прави
            this.age++;
        }
        String getInfo() {  // method с махнати public/private static
            return "age: " + this.age + ", " + "ID: " + this.id + ", " + "Name: " + this.name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Student a = new Student("Joro", 12345678, 30);
        System.out.println(a.getInfo());
        System.out.println(a.getName());
        a.increaseAge();
        System.out.println(a.age);



        System.out.println(a.name);
        a.name = "Gogo";

        System.out.println(a.getInfo());
        a.setName("Joro Purvi");

        Student b = new Student("Boris", 10101010, 25);
        System.out.println(b.getInfo());

        Student c = new Student("JAJA", 11111111, 20);
        System.out.println(c.getInfo());
    }


}
