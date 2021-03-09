package com.zeryts.design.abstractfactory;

/**
 * @author zeryts
 * @description: 工厂方法2
 * -----------------------------------
 * @title: ProductOneFactory
 * @projectName test-jvm
 * @date 2021/3/10 6:29
 */
public class ProductTwoFactory implements Factory {

    private static final ProductTwoFactory install = new ProductTwoFactory();

    @Override
    public Product createProductA() {
        return new ProductA();
    }

    @Override
    public Product createProductB() {
        return new ProductC();
    }

    public static Factory get(){
        return install;
    }
}
