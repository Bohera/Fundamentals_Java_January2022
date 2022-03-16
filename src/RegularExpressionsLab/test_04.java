package RegularExpressionsLab;


public class test_04 {
    public static void main(String[] args) {

        String text = "Hey guys, on 22-Jan-2015 I met a girl in a bar. Then on 2/Feb/2015 we went to a date. She had just turned 23 3-Mar 3\\Jar\\2022";
        String[] split = text.split("\\b(?<day>\\d{1,2})([-/\\\\])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b");
        for (String s : split) {
            System.out.println(s);
        }

    }


}
