package com.zeryts.design.staticproxy;

/**
 * @author zeryts
 * @description: 代理实现类
 * -----------------------------------
 * @title: ConcreateSubject
 * @projectName test-jvm
 * @date 2021/3/10 20:54
 */
public class ConcreateSubject implements Subject{
    @Override
    public void request() {
        System.out.println("request");
    }
}
