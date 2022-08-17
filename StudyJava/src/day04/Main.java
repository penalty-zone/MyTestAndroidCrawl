package day04;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String REGEX = "(cat)";
    private static final String INPUT = "cat cat cat cattie cat";
    public static void main(String[] args) {
//        // 按指定模式在字符串查找
//        String line = "This (order) was placed for QT3000! OK?";
//        String pattern = "(\\(order\\))";  // 在java中：\\表示我要插入一个正则表达式的反斜杠
//        // 创建 Pattern 对象
//        Pattern r = Pattern.compile(pattern);
//        // 现在创建 matcher 对象
//        Matcher m = r.matcher(line);
//
//        if (m.find( )) {
//            System.out.println("Found value: " + m.group(0) );
//            System.out.println("Found value: " + m.group(1) );
//        } else {
//            System.out.println("NO MATCH");
//        }




        Pattern p = Pattern.compile(REGEX);
        Matcher m2 = p.matcher(INPUT); // 获取 matcher 对象
        if (m2.find()) {  // 这里必须使用 find() 一次
            System.out.println(m2);
        }
//        int count = 0;
//        while(m2.find()) {
//            count++;
//            System.out.println("Match number " + count);
//            System.out.println("start(): " + m2.start());
//            System.out.println("end(): " + m2.end());
//        }


    }
}
