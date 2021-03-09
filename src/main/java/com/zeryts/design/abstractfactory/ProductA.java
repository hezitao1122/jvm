package com.zeryts.design.abstractfactory;

/**
 * @author zeryts
 * @description: 产品1的实现
 * -----------------------------------
 * @title: ProducutOne
 * @projectName test-jvm
 * @date 2021/3/10 6:25
 */
public class ProductA implements Product {
    @Override
    public void excute() {
        System.out.println("产品A");
    }
}
