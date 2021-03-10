package com.zeryts.design.command;

/**
 * @author zeryts
 * @description: 命令模式的测试类
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/10 22:12
 */
public class Test {
    public static void main(String[] args) {
        Command a = new CommandA();
        Command b = new CommandA();

        Invoke invoke = new Invoke();
        invoke.setCommand(a);
        invoke.excute();

        invoke.setCommand(b);
        invoke.excute();

    }
}
