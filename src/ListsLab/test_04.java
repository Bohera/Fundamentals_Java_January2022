package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<String>(Arrays.asList("gadfa", "dsada", "dasdasdsa")); //ако няма Arrays.asList няма да може да се добавят и махат елементи само да се променят

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(0);

        Integer x = 0; // тук казва че х е стойнота 0;
        //int x = 0; // тук казва че х е индекса в листа;
        numbers.remove(x);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }
}
