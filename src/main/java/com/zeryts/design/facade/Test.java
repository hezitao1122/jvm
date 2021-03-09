package com.zeryts.design.facade;

/**
 * @author zeryts
 * @description: 门面类的测试
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/10 7:50
 */
public class Test {
    public static void main(String[] args) {
        SystemFacade facade = new SystemFacade();
        facade.execute();
    }
}
