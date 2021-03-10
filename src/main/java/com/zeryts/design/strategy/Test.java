package com.zeryts.design.strategy;

/**
 * @author zeryts
 * @description: 策略模式的测试类
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/11 6:17
 */
public class Test {
    public static void main(String[] args) {
        int discountStyle = 1;

        DiscountCalculatorStrategy discountCalculateStrategy = DiscountCalculatorStrategyFactory.getDiscountCalculateStrategy(discountStyle);

        Context context = new Context(discountCalculateStrategy);
        context.calculator();
    }

}
