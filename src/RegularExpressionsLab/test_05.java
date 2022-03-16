package RegularExpressionsLab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test_05 {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\b(?<day>\\d{1,2})([-/\\\\])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b");
        String text = "Hey guys, on 22-Jan-2015 I met a girl in a bar. Then on 2/Feb/2015 we went to a date. She had just turned 23 3-Mar 3\\Jar\\2022";

        String censored = text.replaceAll("\\b(?<day>\\d{1,2})([-/\\\\])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b", "******");
        System.out.println(censored);
    }


}
