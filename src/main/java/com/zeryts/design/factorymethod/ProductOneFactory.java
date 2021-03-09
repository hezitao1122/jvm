package com.zeryts.design.factorymethod;

/**
 * @author zeryts
 * @description: 工厂方法1
 * -----------------------------------
 * @title: ProductOneFactory
 * @projectName test-jvm
 * @date 2021/3/10 6:29
 */
public class ProductOneFactory extends AbstractProductFactory{

    private static final ProductOneFactory instance = new ProductOneFactory();

    @Override
    protected Producut selfCreate() {
        System.out.println("执行产品1的自己逻辑");
        return new ProducutOne();
    }

    public static AbstractProductFactory get(){
        return instance;
    }
}
