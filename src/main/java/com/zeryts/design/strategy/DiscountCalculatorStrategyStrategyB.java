package com.zeryts.design.strategy;

/**
 * @author zeryts
 * @description: 策略A
 * -----------------------------------
 * @title: DescountCalculatorStrategyA
 * @projectName test-jvm
 * @date 2021/3/11 6:09
 */
public class DiscountCalculatorStrategyStrategyB implements DiscountCalculatorStrategy {
    @Override
    public void calculator() {
        System.out.println("模式B");
    }
}
