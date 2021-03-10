package com.zeryts.design.builds;

/**
 * @author zeryts
 * @description: 构造器模式的变种模式
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/10 8:06
 */
public class Test {

    public static void main(String[] args) {
        Product product = new BuilderPattern().fieldName("张三").fieldAge(23).fieldAdress("北京").create();
        System.out.println(product);
    }
}
