package ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstN = new BigInteger(scanner.nextLine());
        BigInteger secondN = new BigInteger(scanner.nextLine());

        BigInteger result = firstN.add(secondN);

        System.out.println(result);

    }
}
