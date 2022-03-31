package FinalExamPreparationMoreProblems28March2022;

import java.util.*;

public class PlantDiscovery_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Plant> plantList = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] plantInfo = scanner.nextLine().split("<->");
            Plant plant = new Plant(plantInfo[0], Integer.parseInt(plantInfo[1]), new ArrayList<>());
            plant.getRating().add(0);
            plantList.put(plantInfo[0], plant);
        }

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Exhibition")) {
            String[] data = commandLine.split("\\s?[:-]\\s");
            String command = data[0];
            String plant = data[1];
            switch (command) {
                case "Rate":
                    if (!plantList.containsKey(plant)) {
                        System.out.println("error");
                    } else {
                        plantList.get(plant).getRating().add(Integer.parseInt(data[2]));
                    }
                    break;
                case "Update":
                    if (!plantList.containsKey(plant)) {
                    System.out.println("error");
                } else {
                    plantList.get(plant).setRarity(Integer.parseInt(data[2]));
                }
                    break;
                case "Reset":
                    if (!plantList.containsKey(plant)) {
                        System.out.println("error");
                    } else {
                        plantList.get(plant).getRating().clear();
                        plantList.get(plant).getRating().add(0);
                    }
                    break;
            }

            commandLine = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantList.forEach((k, v) -> {
            int sumRating = 0;
            for (int i = 0; i < v.getRating().size(); i++) {
                sumRating += v.getRating().get(i);
            }
            double averageRating = 0;
            if (v.getRating().size() > 1) {
                averageRating = (sumRating + 0.00) / (v.getRating().size() - 1);
            } else {
                averageRating = (sumRating + 0.00) / (v.getRating().size());
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", v.getName(), v.getRarity(), averageRating);
        });
    }

    public static class Plant {
        String name;
        int rarity;
        List<Integer> rating;

        public Plant(String name, int rarity, List<Integer> rating) {
            this.name = name;
            this.rarity = rarity;
            this.rating = rating;
        }

        public List<Integer> getRating() {
            return rating;
        }

        public void setRating(List<Integer> rating) {
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }
    }
}
