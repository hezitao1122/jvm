package com.zeryts.design.strategy;

/**
 * @author zeryts
 * @description: 核心类
 * -----------------------------------
 * @title: Context
 * @projectName test-jvm
 * @date 2021/3/11 6:14
 */
public class Context {
    private DiscountCalculatorStrategy  strategy;

    public Context(DiscountCalculatorStrategy strategy){
        this.strategy = strategy;
    }
    public void calculator(){
        strategy.calculator();
    }

}
