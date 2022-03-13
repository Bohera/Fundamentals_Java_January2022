package TextProcessingLab;

public class test_06 {
    public static void main(String[] args) {

        String text = "the quick brown fox jumps over the lazy dog";

        char search = 't';
        int index = text.indexOf(search);
        while ( index != -1) {
            System.out.println(index);
            index  = text.indexOf(search, index + 1);
        }
    }
}
