package day01;

class Dog {
    public String name;  // 类变量
    public static final int limit = 10;  // 类常量定义方式
    public Dog(){
        System.out.println("实例化dog");
    }
    void set_name(String _name){ name = _name;}
    void get_name(){
        System.out.println(name);
    }
    public static void get_01(){  // 静态方法
        System.out.println("name");   // 静态方法不能使用非静态变量
    }
}



//父类中声明为 public 的方法在子类中也必须为 public。
//
//父类中声明为 protected 的方法在子类中要么声明为 protected，要么声明为 public，不能声明为 private。
//
//父类中声明为 private 的方法，不能够被子类继承。


//使用static修饰的类变量 实例化多少次都是同一个值