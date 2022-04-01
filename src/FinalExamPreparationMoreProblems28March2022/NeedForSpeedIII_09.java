package FinalExamPreparationMoreProblems28March2022;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\|");
            String carName = carInfo[0];
            int carMileage = Integer.parseInt(carInfo[1]);
            int carFuel = Integer.parseInt(carInfo[2]);
            Car car = new Car(carName, carMileage, carFuel);
            cars.put(carName, car);
        }

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Stop")) {
            String[] commandData = commandLine.split(" : ");
            String command = commandData[0];
            String carName = commandData[1];
            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(commandData[2]);
                    int fuelNeeded = Integer.parseInt(commandData[3]);
                    if (cars.get(carName).fuel < fuelNeeded) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        cars.get(carName).setMileage(cars.get(carName).getMileage() + distance);
                        cars.get(carName).setFuel(cars.get(carName).getFuel() - fuelNeeded);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n"
                                , carName, distance, fuelNeeded);
                    }
                    if (cars.get(carName).getMileage() >= 100000) {
                        cars.remove(carName);
                        System.out.printf("Time to sell the %s!%n", carName);
                    }
                    break;
                case "Refuel":
                    int fuelToRefill = Integer.parseInt(commandData[2]);
                    if (cars.get(carName).getFuel() + fuelToRefill > 75) {
                        //TODO check if this is needed?
                        System.out.printf("%s refueled with %d liters%n"
                                , carName, 75 - cars.get(carName).getFuel());
                        cars.get(carName).setFuel(75);

                    } else {
                        cars.get(carName).setFuel(cars.get(carName).getFuel() + fuelToRefill);
                        System.out.printf("%s refueled with %d liters%n", carName, fuelToRefill);
                    }
                    break;
                case "Revert":
                    int kmToDecrease = Integer.parseInt(commandData[2]);
                    if (cars.get(carName).getMileage() - kmToDecrease < 10000) {
                        //TODO check if this is needed?
                        //System.out.printf("%s mileage decreased by %d kilometers%n", carName, cars.get(carName).getMileage() - 10000);
                        cars.get(carName).setMileage(10000);
                    } else {
                        cars.get(carName).setMileage(cars.get(carName).getMileage() - kmToDecrease);
                        System.out.printf("%s mileage decreased by %d kilometers%n", carName, kmToDecrease);
                    }
                    break;
            }
            commandLine = scanner.nextLine();
        }
        cars.forEach((k, v) ->
                System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n"
                        , v.name, v.mileage, v.fuel));
    }

    public static class Car {
        String name;
        int mileage;
        int fuel;

        public Car(String name, int mileage, int fuel) {
            this.name = name;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }
}
