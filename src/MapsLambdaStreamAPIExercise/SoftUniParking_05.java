package MapsLambdaStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingValidation = new LinkedHashMap<>();

        for (int i = 0; i < commandsCount; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String command = line[0];
            String name = line[1];


            switch (command) {
                case "register":
                    String licensePlate = line[2];
                    if (parkingValidation.containsKey(name)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", parkingValidation.get(name));
                    } else {
                        parkingValidation.put(name, licensePlate);
                        System.out.printf( "%s registered %s successfully%n", name, licensePlate);
                    }
                    break;
                case "unregister":
                    if (!parkingValidation.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        parkingValidation.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }
                    break;
            }
        }
        parkingValidation.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
