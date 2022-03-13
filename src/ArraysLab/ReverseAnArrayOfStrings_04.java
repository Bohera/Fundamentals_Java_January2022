package ArraysLab;

import java.util.Scanner;

public class ReverseAnArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] array = input.split("\\s+");

        for (int i = 0; i < array.length / 2; i++) {
            String tempIndexContent = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tempIndexContent;
        }
        //for (int i = 0; i < array.length; i++) {
        //    System.out.print(array[i] + " ");
        //}
        System.out.println(String.join(" ", array));
    }
}
