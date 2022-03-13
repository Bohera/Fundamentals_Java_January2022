package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> testList = new ArrayList<>();
            testList.add(123);
        System.out.println(testList.size());
            testList.remove(0);
        System.out.println(testList.size());


    }
}
