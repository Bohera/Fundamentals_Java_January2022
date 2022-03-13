package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class BackIn30Minutes_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt(); // int hours = Integer.parseInt(scanner.nextLine());
        int minutes = scanner.nextInt(); // int minutes = Integer.parseInt(scanner.nextLine());

        int finalMinutes = minutes + 30; // minutes += 30;

        if (finalMinutes >= 60) { // finalMinutes > 59;
            hours += 1; // hours ++;
            if (hours > 23) {
                hours = 0; // hours -= 24;
            }
            finalMinutes -= 60;
        }
        System.out.printf("%d:%02d", hours, finalMinutes);
    }
}
