package com.zeryts.design.singleton;

/**
 * @author zeryts
 * @description: 单例模式的测试类
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/10 7:13
 */
public class Test {
    public static void main(String[] args) {
        HungrySingletonPattern.getInstall().excute();
        UnsafeFullSinglrtonPattern.getInstance().excute();
        SafeFullSinglrtonPattern.getInstance().excute();
    }
}
