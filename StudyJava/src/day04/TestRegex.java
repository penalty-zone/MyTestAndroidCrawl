package day04;

import java.util.regex.*;
import java.util.regex.Pattern;

public class TestRegex {
    public static String text = "185711404x@@@@";
    public static Pattern p = Pattern.compile("([0-9]*)");
    public static Matcher m = p.matcher(text);

    public static void main(String[] args) {
        if (m.find()) {
            System.out.println(m.group(1));
        }
    }
}
