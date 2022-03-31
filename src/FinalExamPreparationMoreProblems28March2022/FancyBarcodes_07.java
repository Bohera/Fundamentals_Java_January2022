package FinalExamPreparationMoreProblems28March2022;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();

            Pattern patternBarcode = Pattern.compile("(@[#]+)(?<product>[A-Z][A-Za-z0-9]{4,}[A-Z])(@[#]+)");
            Matcher matcherBarcode = patternBarcode.matcher(line);
            String product = "";
            if (!matcherBarcode.find()) {
                System.out.println("Invalid barcode");
                continue;
            } else {
                product = matcherBarcode.group("product");
            }
            StringBuilder productGroup = new StringBuilder();
            for (int j = 0; j < product.length(); j++) {
                if (Character.isDigit(product.charAt(j))) {
                    productGroup.append(product.charAt(j));
                }
            }
            //if (productGroup.isEmpty()) {
            if (productGroup.length() == 0) {
                System.out.println("Product group: 00");
            } else {
                System.out.printf("Product group: %s%n", productGroup);
            }
         }

    }
}
