package com.zeryts.design.template;

/**
 * @author zeryts
 * @description: 模板方法设计模式
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/10 6:05
 */
public class Test {
    /**
     * 在Base中封装通用的计算逻辑
     */
    public static void main(String[] args) {
        AppleCountCalculatorl app = new AppleCountCalculatorlImpl();
        app.calculateSubApple();
    }
}
