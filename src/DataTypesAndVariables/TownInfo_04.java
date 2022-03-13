package DataTypesAndVariables;

import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfTown = scanner.nextLine();
        int population = scanner.nextInt();
        short area = scanner.nextShort();

        System.out.printf("Town %s has population of %d and area %d square km.", nameOfTown, population, area);

    }
}
