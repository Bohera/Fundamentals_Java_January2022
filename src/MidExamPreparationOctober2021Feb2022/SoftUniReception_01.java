package MidExamPreparationOctober2021Feb2022;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());
        int thirdInput = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int perHourSum = firstInput + secondInput + thirdInput;

        int hoursCount = 0;

        while (studentsCount > 0) {
            hoursCount++;
            if (hoursCount % 4 != 0){
                studentsCount -= perHourSum;
            }
        }


        System.out.printf("Time needed: %dh.", hoursCount);
    }
}
