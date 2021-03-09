package com.zeryts.design.abstractfactory;


/**
 * @author zeryts
 * @description: 工厂方法1
 * -----------------------------------
 * @title: ProductOneFactory
 * @projectName test-jvm
 * @date 2021/3/10 6:29
 */
public class ProductOneFactory implements Factory {

    private static final ProductOneFactory install = new ProductOneFactory();

    @Override
    public Product createProductA() {
        return new ProductA();
    }

    @Override
    public Product createProductB() {
        return new ProductB();
    }

    public static Factory get(){
        return install;
    }
}
