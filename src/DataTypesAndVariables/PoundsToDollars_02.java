package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal britishPounds = new BigDecimal(scanner.nextLine());
        double convertRateUSD = 1.36;
        BigDecimal usDollars = britishPounds.multiply(new BigDecimal(convertRateUSD));

        System.out.printf("%.3f", usDollars);

    }
}