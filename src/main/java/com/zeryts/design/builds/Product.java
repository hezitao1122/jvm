package com.zeryts.design.builds;

/**
 * @author zeryts
 * @description: 产品
 * -----------------------------------
 * @title: Product
 * @projectName test-jvm
 * @date 2021/3/10 7:54
 */
public class Product implements Build{

    private String name;

    private int age;

    private String address;

    public String getName() {
        return name;
    }

    @Override
    public void fieldName(String name) {
        System.out.println("执行buidName逻辑!");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void fieldAge(int age) {
        System.out.println("执行buidAge逻辑!");
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void fieldAdress(String address) {
        System.out.println("执行buidAdress逻辑!");
        this.address = address;
    }
}
