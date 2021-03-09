package com.zeryts.design.abstractfactory;

/**
 * @author zeryts
 * @description: 抽象工厂测试
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/10 6:58
 */
public class Test {


    public static void main(String[] args) {
        Factory factory1 = ProductOneFactory.get();
        Factory factory2 = ProductTwoFactory.get();
        Product productA = factory1.createProductA();
        Product productB = factory1.createProductB();

        Product productA1 = factory2.createProductA();
        Product productB1 = factory2.createProductB();
        productA.excute();
        productB.excute();
        productA1.excute();
        productB1.excute();

    }
}
