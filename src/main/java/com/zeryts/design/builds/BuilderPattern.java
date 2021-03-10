package com.zeryts.design.builds;

/**
 * @author zeryts
 * @description: 构建模式
 * -----------------------------------
 * @title: BuilderPattern
 * @projectName test-jvm
 * @date 2021/3/10 7:57
 */
public class BuilderPattern implements Build{

    private Build product = new Product();

    @Override
    public void fieldName(String name) {
        System.out.println("执行校验fieldName!");
        product.fieldName(name);
    }

    @Override
    public void fieldAge(int age) {
        System.out.println("执行校验age!");
        product.fieldAge(age);
    }

    @Override
    public void fieldAdress(String address) {
        System.out.println("执行校验adress!");
        product.fieldAdress(address);
    }



}
