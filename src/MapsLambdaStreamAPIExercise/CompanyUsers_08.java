package MapsLambdaStreamAPIExercise;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<String, List<String>> companiesUsers = new LinkedHashMap<>();

        while (!line.equals("End")) {
            String[] entries = line.split(" -> ");
            String companyName = entries[0];
            String employeeId = entries[1];

            companiesUsers.putIfAbsent(companyName, new ArrayList<>());
            boolean isPresent = false;
            for (int i = 0; i < companiesUsers.get(companyName).size(); i++) {
               if (companiesUsers.get(companyName).get(i).equals(employeeId)) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                companiesUsers.get(companyName).add(employeeId);
            }


            line = scanner.nextLine();
        }
        companiesUsers.forEach((k,v) -> {
            System.out.println(k);
            for (int i = 0; i < companiesUsers.get(k).size(); i++) {
                System.out.printf("-- %s%n", companiesUsers.get(k).get(i));
            }
        });
    }
}
