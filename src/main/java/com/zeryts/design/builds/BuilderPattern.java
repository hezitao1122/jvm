package com.zeryts.design.builds;

/**
 * @author zeryts
 * @description: 构建模式
 * -----------------------------------
 * @title: BuilderPattern
 * @projectName test-jvm
 * @date 2021/3/10 7:57
 */
public class BuilderPattern implements Build {

    private Product product = new Product();

    @Override
    public Build fieldName(String name) {
        System.out.println("执行校验fieldName!");
        product.setName(name);
        return this;
    }

    @Override
    public Build fieldAge(int age) {
        System.out.println("执行校验age!");
        product.setAge(age);
        return this;
    }

    @Override
    public Build fieldAdress(String address) {
        System.out.println("执行校验adress!");
        product.setAddress(address);
        return this;
    }

    @Override
    public Product create() {
        return product;
    }


}
