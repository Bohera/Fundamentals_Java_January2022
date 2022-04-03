package FinalExam03April2022;

import java.util.*;

public class WildZoo_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandLine = scanner.nextLine();
        Map<String, Animal> animalMap = new LinkedHashMap<>();
        Map<String, Area> areaMap = new LinkedHashMap<>();

        while (!commandLine.equals("EndDay")) {
            String[] data = commandLine.split(":\\s|-");
            String command = data[0];
            switch (command) {
                case "Add":
                    String animalName = data[1];
                    int foodNeeded = Integer.parseInt(data[2]);
                    String areaName = data[3];
                    Animal animal = new Animal(animalName, foodNeeded, areaName);
                    if (animalMap.containsKey(animalName)) {
                        animalMap.get(animalName).setFoodNeeded(animalMap.get(animalName).getFoodNeeded() + foodNeeded);
                        if (!areaMap.get(areaName).getAnimalList().contains(animalMap.get(animalName))) {
                            if (animalMap.get(animalName).getFoodNeeded() > 0) {
                                areaMap.get(areaName).getAnimalList().add(animal);
                            }
                        }
                    } else {
                        animalMap.put(animalName, animal);
                        Area area = new Area(new ArrayList<>());
                        if (areaMap.containsKey(animalMap.get(animalName).getArea())) {
                            areaMap.get(areaName).getAnimalList().add(animal);
                        } else {
                            areaMap.put(areaName, area);
                            areaMap.get(areaName).getAnimalList().add(animal);
                        }
                    }

                    break;
                case "Feed":
                    animalName = data[1];
                    int foodGiven = Integer.parseInt(data[2]);
                    if (animalMap.containsKey(animalName)) {
                        animalMap.get(animalName).setFoodNeeded(animalMap.get(animalName).getFoodNeeded() - foodGiven);
                        if (animalMap.get(animalName).getFoodNeeded() <= 0) {
                            System.out.printf("%s was successfully fed%n", animalName);
                            areaMap.get(animalMap.get(animalName).getArea()).getAnimalList().remove(animalMap.get(animalName));
                        }
                    }

                    break;
            }
            commandLine = scanner.nextLine();
        }
        System.out.println("Animals:");
        animalMap.forEach((k, v) -> {
            if (animalMap.get(k).getFoodNeeded() > 0) {
                System.out.printf(" %s -> %dg%n", v.getAnimalName(), v.getFoodNeeded());
            }
        });
        System.out.println("Areas with hungry animals:");
        areaMap.forEach((k, v) -> {
            if (areaMap.get(k).getAnimalList().size() > 0) {
                System.out.printf(" %s: %d%n", k, areaMap.get(k).getAnimalList().size());
            }
        });


    }

    public static class Animal {
        String animalName;
        int foodNeeded;
        String area;

        public Animal(String animalName, int foodNeeded, String area) {
            this.animalName = animalName;
            this.foodNeeded = foodNeeded;
            this.area = area;
        }

        public String getAnimalName() {
            return animalName;
        }

        public void setAnimalName(String animalName) {
            this.animalName = animalName;
        }

        public int getFoodNeeded() {
            return foodNeeded;
        }

        public void setFoodNeeded(int foodNeeded) {
            this.foodNeeded = foodNeeded;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }
    }

    public static class Area {
        List<Animal> animalList;

        public Area(List<Animal> animalList) {
            this.animalList = animalList;
        }

        public List<Animal> getAnimalList() {
            return animalList;
        }

        public void setAnimalList(List<Animal> animalList) {
            this.animalList = animalList;
        }
    }
}
