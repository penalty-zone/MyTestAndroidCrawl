package day01;

abstract class SuperClass{
    abstract void m(); //抽象方法
}

class SubClass extends SuperClass{
    //实现抽象方法
    void m(){
          System.out.println("我是抽象方法");

    }
}

class AAA extends Dog{
    void get_name(){
        System.out.println("aaaaaaa"+name);
    }
}

public class Main {
    public static void main(String[] args){
        Dog dog_cls = new AAA();
        String ac = "abcd我选e";
        dog_cls.set_name(ac);
        dog_cls.get_name();
        System.out.println("1"+dog_cls.name);
        Dog.get_01();  // 静态变量以及静态方法可以直接访问

        Integer x = 1;
        boolean ad = x instanceof Integer;
        System.out.println(ad);
    }
}

// 访问修饰符
/*
default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。

private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）

public : 对所有类可见。使用对象：类、接口、变量、方法

protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
 */


//非访问修饰符
/*
static 修饰符，用来修饰类方法和类变量。

final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。

abstract 修饰符，用来创建抽象类和抽象方法。

synchronized 和 volatile 修饰符，主要用于线程的编程。
 */

// 静态方法不是使用非静态变量