package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distancesList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int pokemonIndex = Integer.parseInt(scanner.nextLine());
        int sumOfRemovedElements = 0;
        while (distancesList.size() != 0) {
            int valueOfIndex;
            if (pokemonIndex < 0) {
                valueOfIndex = distancesList.get(0);
                sumOfRemovedElements += valueOfIndex;
                distancesList.set(0, distancesList.get(distancesList.size() - 1));
                sumSmallerOrExtractLarger(distancesList, valueOfIndex);
            } else if (pokemonIndex > distancesList.size() -1) {
                valueOfIndex = distancesList.get(distancesList.size() - 1);
                sumOfRemovedElements += valueOfIndex;
                distancesList.set(distancesList.size() - 1, distancesList.get(0));
                sumSmallerOrExtractLarger(distancesList, valueOfIndex);
            } else {
                valueOfIndex = distancesList.get(pokemonIndex);
                sumOfRemovedElements += valueOfIndex;
                distancesList.remove(pokemonIndex);
                sumSmallerOrExtractLarger(distancesList, valueOfIndex);
            }

            if (distancesList.size() != 0) {
                pokemonIndex = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(sumOfRemovedElements);
    }

    private static void sumSmallerOrExtractLarger(List<Integer> distancesList, int valueOfIndex) {
        for (int i = 0; i < distancesList.size(); i++) {
            if (distancesList.get(i) <= valueOfIndex) {
                distancesList.set(i, distancesList.get(i) + valueOfIndex);
            } else {
                distancesList.set(i, distancesList.get(i) - valueOfIndex);
            }
        }
    }
}
