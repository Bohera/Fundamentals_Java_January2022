package ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        BigInteger bigFactorial = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= number; i++) {
            bigFactorial = bigFactorial.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
        }
        System.out.println(bigFactorial);

    }
}
