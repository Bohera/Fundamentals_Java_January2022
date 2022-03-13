package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;

        switch (dayOfWeek) {
            case "Friday":
                switch (groupType) {
                    case "Students":
                        price = 8.45;
                        break;
                    case "Business":
                        price = 10.90;
                        break;
                    case "Regular":
                        price = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (groupType) {
                    case "Students":
                        price = 9.80;
                        break;
                    case "Business":
                        price = 15.60;
                        break;
                    case "Regular":
                        price = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (groupType) {
                    case "Students":
                        price = 10.46;
                        break;
                    case "Business":
                        price = 16;
                        break;
                    case "Regular":
                        price = 22.50;
                        break;
                }
                break;
        }

        if (groupType.equals("Students") && peopleCount >= 30) {
            System.out.printf("Total price: %.2f", (price * peopleCount) * 0.85);
        } else if (groupType.equals("Business") && peopleCount >= 100) {
            System.out.printf("Total price: %.2f", (price * peopleCount) - (10 * price));
        } else if (groupType.equals("Regular") && peopleCount >= 10 && peopleCount <= 20) {
            System.out.printf("Total price: %.2f", (price * peopleCount) * 0.95);
        } else {
            System.out.printf("Total price: %.2f", price * peopleCount);
        }
    }
}
