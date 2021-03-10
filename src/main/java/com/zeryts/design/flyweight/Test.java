package com.zeryts.design.flyweight;

/**
 * @author zeryts
 * @description: 享元模式的测试类
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/11 7:10
 */
public class Test {


    public static void main(String[] args) {
        Flyweight o1 = FlyweightFactory.get("对象1");
        Flyweight o2 = FlyweightFactory.get("对象1");

        System.out.println(o1 == o2);
    }
}
