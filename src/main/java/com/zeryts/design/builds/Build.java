package com.zeryts.design.builds;

/**
 * @author zeryts
 * @description: 构造的接口
 * -----------------------------------
 * @title: Build
 * @projectName test-jvm
 * @date 2021/3/10 7:57
 */
public interface Build {

    Build fieldName(String name);

    Build fieldAge(int age);

    Build fieldAdress(String address);

    Product create();
}
