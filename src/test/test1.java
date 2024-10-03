package test;


import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
     int a =333;
     Object b =a;
     test(a);
     test(b);
        Object obj = new ArrayList<>();

        Class<?> clazz = obj.getClass();
        System.out.println("Object is of type: " + clazz.getName());

    }
    public static void test(int a){
        System.out.println(a);
    }
    public static void test(Object a){
        System.out.println(a+"this one");
    }
}
