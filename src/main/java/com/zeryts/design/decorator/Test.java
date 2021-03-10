package com.zeryts.design.decorator;

/**
 * @author zeryts
 * @description: 装饰器模式的测试类
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/11 7:16
 */
public class Test {

    public static void main(String[] args) {
        Component component = new ConcreateComponent();

        Component add = new Decorator(component);

        add.execute();

    }
}
