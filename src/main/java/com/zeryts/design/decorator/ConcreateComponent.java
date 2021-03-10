package com.zeryts.design.decorator;

/**
 * @author zeryts
 * @description: 实现
 * -----------------------------------
 * @title: ConcreateComponent
 * @projectName test-jvm
 * @date 2021/3/11 7:14
 */
public class ConcreateComponent implements Component{
    @Override
    public void execute() {
        System.out.println("基础功能");
    }
}
