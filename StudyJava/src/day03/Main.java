package day03;
import java.util.Date;
import  java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
//        System.out.println(ft.format(date));
        String asout = "%tF%n".formatted(date);
        System.out.println(asout);
        Date t;
        try {
            Thread.sleep(1000*10);
            System.out.println("等待10秒");
            t = ft.parse(asout);  // 被 throws ParseException 的方法需要使用try包裹
            System.out.println(t);
        } catch (ParseException e){
            System.out.println("Unparseable using " + ft);
        } catch (InterruptedException e){
            System.out.println("输出");
        }
    }
}

