package TextProcessingExercise;

import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = "someText";

        System.out.println(text.substring(0, 4)); //int start(inclusive), int end (exclusive)
        System.out.println(text.substring(4));
        System.out.println(text.indexOf("T"));

        text = "|s|ome|Tex|t";

        System.out.println(text.lastIndexOf("|"));

        text = "|s|ome|Text";

        System.out.println(text.contains("Text"));

        String email = "boris.m.mitov@gmail.com";

        String email2 = new String(); //stringbuilder - mutable, moje da se promenq
        email = email.replace("boris.m.mitov", "bohera.m.mohera"); //immutable - ne moje da se promeq trqbva da se prezapishe
        System.out.println(email);

        System.out.println(email.replace("boris.m.mitov", "bohera.m.mohera")); // taka moje i bez promenliva

        StringBuilder sb = new StringBuilder();

        sb.append("Boris ");
        sb.append(" ");
        sb.append("Mitov");
        sb.append(System.lineSeparator());
        sb.append("Gosho");
        sb.insert(6, "Margaritov");
        System.out.println(sb);

        sb.replace(22, sb.length(), "Tosho");
        System.out.println(sb);
        sb.delete(6, sb.length());
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
    }
}
