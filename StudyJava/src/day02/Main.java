package day02;

import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};
//        while ()
//        int x = 10;
//        do{
//            System.out.print("value of x : " + x );
//            x++;
//            System.out.print("\n");
//        }while( x < 20 );

//        for (int a=0; a<10;a+=1){}
        for(int x : numbers ) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
        Integer a = 1;  // 一般能直接用int的就直接用，别搞包装器类型
        Integer b = 2;
        System.out.println(a > b);

        Integer x = 5;
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(Math.random());

        String ab = "xxxxxxx";
        String ac = "x";
        System.out.println(ab.compareTo(ac));


        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
        sb.delete(5,8);
        System.out.println(sb);

        System.out.println(sb.getClass().toString());
        System.out.println("aaa" instanceof String);
    }
}


//如果需要对字符串进行修改推荐使用 StringBuffer,不用String
//由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
//若是在线程安全情况下必须使用 StringBuffer
