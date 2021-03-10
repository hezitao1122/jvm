package com.zeryts.design.strategy;

/**
 * @author zeryts
 * @description: 策略工厂
 * -----------------------------------
 * @title: DeicountCaculatorStrategyFactory
 * @projectName test-jvm
 * @date 2021/3/11 6:10
 */
public class DiscountCalculatorStrategyFactory {

    public static DiscountCalculatorStrategy getDiscountCalculateStrategy(int descountStyle){
        if(descountStyle == 1){
            return new DiscountCalculatorStrategyStrategyA();
        }else if(descountStyle == 2){
            return new DiscountCalculatorStrategyStrategyB();
        }else{
            return new DiscountCalculatorStrategyStrategyC();
        }
    }

}
