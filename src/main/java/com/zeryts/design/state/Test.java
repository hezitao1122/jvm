package com.zeryts.design.state;

/**
 * @author zeryts
 * @description: 状态模式的测试类
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/11 6:35
 */
public class Test {

    public static void main(String[] args) {
        int styleType = 1;
        Context context = new Context();
        context.execute(1);
        context.execute(2);
        context.execute(3);

    }
}
