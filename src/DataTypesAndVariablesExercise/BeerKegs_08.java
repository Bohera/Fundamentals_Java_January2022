package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxVolume = 0;
        String maxKegModel = "";

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double currentVolume = Math.PI * Math.pow(radius,2) * height;

            if (currentVolume > maxVolume){
                maxVolume = currentVolume;
                maxKegModel = model;
            }
        }
        System.out.println(maxKegModel);
    }
}
