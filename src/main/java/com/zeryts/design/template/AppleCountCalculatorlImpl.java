package com.zeryts.design.template;

/**
 * @author zeryts
 * @description: Apple产品的计算逻辑
 * -----------------------------------
 * @title: AppleCountCalculatorl
 * @projectName test-jvm
 * @date 2021/3/10 6:03
 */
public class AppleCountCalculatorlImpl extends BaseCountCalculatorl implements AppleCountCalculatorl{
    @Override
    public void calculateSubApple() {
        calculate();
        calculateSub();
    }

    @Override
    protected void calculateSub() {
        System.out.println("计算苹果的计算逻辑");
    }
}
