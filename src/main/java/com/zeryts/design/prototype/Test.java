package com.zeryts.design.prototype;

/**
 * @author zeryts
 * @description: 原型模式的测试
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/10 20:10
 */
public class Test {

    public static void main(String[] args) {
        Product product = new Product("张三" , new Component("产品1"));
        try {
            Product product1 = (Product)product.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
