package MapsLambdaStreamAPILab;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordAndSynonyms = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            List<String> listOfSynonyms = wordAndSynonyms.get(word);

            if (listOfSynonyms != null) {
                listOfSynonyms.add(synonym);
            } else {
                listOfSynonyms = new ArrayList<>();
                listOfSynonyms.add(synonym);
                wordAndSynonyms.put(word, listOfSynonyms);
            }
        }


        for (Map.Entry<String, List<String>> entry : wordAndSynonyms.entrySet()) {
            System.out.print(entry.getKey() + " - ");
            int size = entry.getValue().size();
            int counter = 1;
            for (String synonym : entry.getValue()) {
                if (counter < size) {
                    System.out.print(synonym + ", ");
                } else {
                    System.out.print(synonym);
                }
                counter++;
            }
            System.out.println();
        }
    }
}
