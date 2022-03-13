package MapsLambdaStreamAPIExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Legendary_Farming_031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasWinner = false;
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, String> legendaryItems = new HashMap<>();
        legendaryItems.put("shards", "Shadowmourne obtained!");
        legendaryItems.put("fragments", "Valanyr obtained!");
        legendaryItems.put("motes", "Dragonwrath obtained!");

        String winner = "";
        while (!hasWinner) {
            String[] data = scanner.nextLine().split("\\s+");
            for (int i = 0; i < data.length - 1; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String resources = data[i + 1].toLowerCase();
                items.putIfAbsent(resources, 0);
                items.put(resources, items.get(resources) + quantity);
                if (resources.equals("shards") ||
                        resources.equals("fragments") || resources.equals("motes")) {
                    if (items.get(resources) >= 250) {
                        items.put(resources, items.get(resources) - 250);
                        winner = resources;
                        hasWinner = true;
                        break;
                    }
                }
            }
        }
        System.out.println(legendaryItems.get(winner));
        items.forEach((k, v) -> System.out.printf("%s: %d%n", k, v));
    }
}
