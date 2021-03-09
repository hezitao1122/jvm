package com.zeryts.design.factorymethod;

/**
 * @author zeryts
 * @description: 工厂方法2
 * -----------------------------------
 * @title: ProductOneFactory
 * @projectName test-jvm
 * @date 2021/3/10 6:29
 */
public class ProductTwoFactory extends AbstractProductFactory{

    private static final ProductTwoFactory instance = new ProductTwoFactory();

    @Override
    protected Producut selfCreate() {
        System.out.println("执行产品2的自己逻辑");
        return new ProducutOne();
    }

    public static AbstractProductFactory get(){
        return instance;
    }
}
