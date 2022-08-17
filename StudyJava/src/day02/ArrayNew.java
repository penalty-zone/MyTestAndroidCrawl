package day02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayNew {
    public static void main(String[] args) {
        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        // double[] myList = {1.9, 2.9, 3.4, 3.5};
        int[] _arr =  new int[10];
        int[] arr_ = {1,1,1};  // 有几个长度就是几
        myList[0] = 5.6;
        arr_[2] = 10;
        // arr_[3] = 10;  // 超长
        // 计算所有元素的总和
        double total = 0;
        for (double i : myList) {
            total += i;
        }
        System.out.println("总和为： " + total);
        System.out.println(Arrays.toString(arr_));


        String[][] str = new String[3][4]; // 多位数组，就是数组的数据[[[],[],[],[]],[...],[...]]
    }
}
