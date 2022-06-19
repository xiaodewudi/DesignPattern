package com.single_ton;

/**
 * 模板设计模式
 * 父类提取公共代码，子类实现可变部分，便于代码复用
 */
public class Template {
    public static void main(String[] args) {

    }
}

abstract class Father {

    //定义可变部分方法
    public abstract void job();

    private void templateMethod() {
        System.out.println("共用模板代码");
        job();
        System.out.println("共用模板代码");
    }
}

class AA extends Template {
    public void job() {
        System.out.println("代码AA");
    }
}

class BB extends Template {
    public void job() {
        System.out.println("代码BB");
    }
}
