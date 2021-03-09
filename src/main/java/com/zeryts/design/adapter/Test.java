package com.zeryts.design.adapter;

/**
 * @author zeryts
 * @description: 适配器的测试类
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/10 5:51
 */
public class Test {
    /**
     * 适配器是实现了新接口,但适配器中包含了新接口的引用
     */
    public static void main(String[] args) {
        NewInterface newInterface = new NewInterfaceAdapter(new OldInterfaceImpl());
        newInterface.newSay();
    }


}
