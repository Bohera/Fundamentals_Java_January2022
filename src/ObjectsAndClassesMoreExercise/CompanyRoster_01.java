package ObjectsAndClassesMoreExercise;

import java.util.*;

public class CompanyRoster_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Employee> employeesMap = new LinkedHashMap<>();
        Map<String, Department> departmentMap = new LinkedHashMap<>();
        List<Employee> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] dataLine = scanner.nextLine().split(" ");
            String email = "n/a";
            int age = -1;

            if (dataLine.length == 5 && dataLine[4].charAt(0) >= '0' && dataLine[4].charAt(0) <= '9') {
                age = Integer.parseInt(dataLine[4]);
            } else if (dataLine.length == 5 && (dataLine[4].charAt(0) < '0' || dataLine[4].charAt(0) > '9')) {
                email = dataLine[4];
            } else if (dataLine.length == 6) {
                email = dataLine[4];
                age = Integer.parseInt(dataLine[5]);
            }
            Employee employee = new Employee(dataLine[0], Double.parseDouble(dataLine[1]), dataLine[2], dataLine[3], email, age);
            employeesMap.put(dataLine[0], employee);
            names.add(employee);

            if (!departmentMap.containsKey(dataLine[3])) {
                Department department = new Department(dataLine[3], Double.parseDouble(dataLine[1]), 1);
                departmentMap.put(dataLine[3], department);
            } else {
                departmentMap.get(dataLine[3]).setSalarySum(departmentMap.get(dataLine[3]).getSalarySum() + Double.parseDouble(dataLine[1]));
                departmentMap.get(dataLine[3]).setCounter(departmentMap.get(dataLine[3]).getCounter() + 1);
            }

        }
        double[] maxAverageSalary = {Double.MIN_VALUE};
        String[] topDepartment = {""};
        departmentMap.forEach((k, v) -> {
            double currentAverage = v.getSalarySum() / v.getCounter();
            if (currentAverage > maxAverageSalary[0]) {
                maxAverageSalary[0] = currentAverage;
                topDepartment[0] = v.getDepartmentName();
            }
        });
        System.out.printf("Highest Average Salary: %s%n", topDepartment[0]);

        names.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .filter(employee -> employee.getDepartment().equals(topDepartment[0]))
                .forEach(e -> System.out.println(e.toString()));
    }

    public static class Employee {
        String name;
        double salary;
        String position;
        String department;
        String email;
        int age;

        public Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public String getDepartment() {
            return department;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s %.2f %s %d", name, salary, email, age);
        }
    }

    public static class Department {
        String departmentName;
        double salarySum;
        int counter;

        public Department(String departmentName, double salarySum, int counter) {
            this.departmentName = departmentName;
            this.salarySum = salarySum;
            this.counter = counter;
        }

        public int getCounter() {
            return counter;
        }

        public void setCounter(int counter) {
            this.counter = counter;
        }

        public double getSalarySum() {
            return salarySum;
        }

        public void setSalarySum(double salarySum) {
            this.salarySum = salarySum;
        }

        public String getDepartmentName() {
            return departmentName;
        }
    }
}
