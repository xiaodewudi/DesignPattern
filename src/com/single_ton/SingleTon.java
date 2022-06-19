package com.single_ton;

/**
 * 饿汉式
 * 类加载时，就创建了对象，即使没有去调用
 */
public class SingleTon {
    public static void main(String[] args) {
        System.out.println(A.getInstance().getName());
    }
}

class A {
    private String name;
    private static A a = new A("我是A的对象");

    private A(String name) {
        this.name = name;
    }

    public static A getInstance() {
        return a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setA(A a) {
        A.a = a;
    }
}
