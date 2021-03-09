package com.zeryts.design.factorymethod;

/**
 * @author zeryts
 * @description: 模板方法设计模式
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/10 6:39
 */
public class Test {

    /**
     * 封装公用的抽象工厂逻辑
     */
    public static void main(String[] args) {
        Producut producut1= ProductOneFactory.get().create();
        Producut producut2 = ProductTwoFactory.get().create();
        producut1.excute();
        producut2.excute();
    }

}
