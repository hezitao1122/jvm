package com.zeryts.design.prototype;

/**
 * @author zeryts
 * @description: 产品类
 * -----------------------------------
 * @title: Product
 * @projectName test-jvm
 * @date 2021/3/10 20:07
 */
public class Product {
    private String name;

    private Component component;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public Product(String name, Component component) {
        this.name = name;
        this.component = component;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Product(name, (Component)component.clone());
    }
}
