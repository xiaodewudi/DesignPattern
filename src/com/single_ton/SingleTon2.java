package com.single_ton;

/**
 * 懒汉式
 */
public class SingleTon2 {
    public static void main(String[] args) {
        System.out.println(B.getInstance().getName());
    }
}

class B {
    private String name;
    private static B b;

    public B(String name) {
        this.name = name;
    }

    public static B getInstance() {
        if (b == null) {
            b = new B("我是B的对象");
        }
        return b;
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static B getB() {
        return b;
    }

    public static void setB(B b) {
        B.b = b;
    }
}