package RegularExpressionsExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputData = Arrays.stream(scanner.nextLine().split(",\\s*")).collect(Collectors.toList());


        for (int i = 0; i < inputData.size(); i++) {
            if (inputData.get(i).contains(" ")) {
                inputData.set(i, inputData.get(i).replaceAll(" ", ""));

            }
            //health
            String demonName = inputData.get(i);
            int totalDemonHealth = 0;
            Pattern healthPattern = Pattern.compile("[^0-9*,./+-]");
            Matcher healthMatcher = healthPattern.matcher(demonName);
            while (healthMatcher.find()) {
                totalDemonHealth += healthMatcher.group().charAt(0);
            }

            //damage
            double totalDemonDamage = 0.0;
            Pattern damagePattern = Pattern.compile("[+-]?[0-9]+[.]?[0-9]*");
            Matcher damageMatcher = damagePattern.matcher(demonName);
            while (damageMatcher.find()) {
                totalDemonDamage += Double.parseDouble(damageMatcher.group());
            }
            //damageOperators
            Pattern operatorPattern = Pattern.compile("[*/]");
            Matcher operatorMatcher = operatorPattern.matcher(demonName);
            while (operatorMatcher.find()) {
                if (operatorMatcher.group().equals("*")) {
                    totalDemonDamage *= 2;
                } else if (operatorMatcher.group().equals("/")) {
                    totalDemonDamage /= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", demonName, totalDemonHealth, totalDemonDamage);
        }
    }

}
