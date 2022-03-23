package FinalExamPreparation23March2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Pattern cityPattern = Pattern.compile("([=/])(?<city>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = cityPattern.matcher(line);

        List<String> listCity = new ArrayList<>();
        int sumTravelPoints = 0;
        while (matcher.find()) {
            listCity.add(matcher.group("city"));
            sumTravelPoints += matcher.group("city").length();
        }

        System.out.print("Destinations: ");         //System.out.print("Destinations: " + String.join(", ", listCity);
        for (int i = 0; i < listCity.size(); i++) {
            System.out.print(listCity.get(i));
            if (i != listCity.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.printf("Travel Points: %d", sumTravelPoints); //System.out.printf("Travel Points: " + listCity
                                                                                                            // .stream()
                                                                                                            //.mapToInt(d -> d.length())
                                                                                                            //.sum() ;
    }
}
