package com.zeryts.design.command;

/**
 * @author zeryts
 * @description:
 * -----------------------------------
 * @title: Invoke
 * @projectName test-jvm
 * @date 2021/3/10 22:11
 */
public class Invoke implements Command{

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    @Override
    public void excute() {
        command.excute();
    }
}
