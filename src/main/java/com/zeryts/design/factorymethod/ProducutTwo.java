package com.zeryts.design.factorymethod;

/**
 * @author zeryts
 * @description: 产品2的实现
 * -----------------------------------
 * @title: ProducutOne
 * @projectName test-jvm
 * @date 2021/3/10 6:25
 */
public class ProducutTwo implements Producut{
    @Override
    public void excute() {
        System.out.println("生产产品的通用逻辑");
    }
}
