package ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayFirstNumbers = scanner.nextLine().split(" ");
        String[] arraySecondNumbers = scanner.nextLine().split(" ");

        List<String> listFirstNumbers = convertStringArrayToList(arrayFirstNumbers);
        List<String> listSecondNumbers = convertStringArrayToList(arraySecondNumbers);


        List<String> listResultNumbers = new ArrayList<>();

        int index = 0;
        if (listFirstNumbers.size() > listSecondNumbers.size()){
            while (index < listFirstNumbers.size()) {
                listResultNumbers.add(listFirstNumbers.get(index));
                if (index < listSecondNumbers.size()){
                    listResultNumbers.add(listSecondNumbers.get(index));
                }
                index++;
            }
        } else {
            while (index < listSecondNumbers.size()) {
                if (index < listFirstNumbers.size()){
                    listResultNumbers.add(listFirstNumbers.get(index));
                }
                listResultNumbers.add(listSecondNumbers.get(index));

                index++;
            }
        }


        for (int i = 0; i < listResultNumbers.size(); i++) {
            System.out.print(listResultNumbers.get(i) + " ");
        }

    }

    private static List<String> convertStringArrayToList(String[] arrayNumbers) {
        List<String> tempList = new ArrayList<>();
        int i = 0;
        while (i < arrayNumbers.length) {
            tempList.add(arrayNumbers[i]);
            i++;
        }
        return tempList;
    }
}
