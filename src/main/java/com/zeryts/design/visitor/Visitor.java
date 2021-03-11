package com.zeryts.design.visitor;

/**
 * @author zeryts
 * @description: 通用visitor
 * -----------------------------------
 * @title: Visitor
 * @projectName test-jvm
 * @date 2021/3/11 7:54
 */
public interface Visitor {

    void execute();

    void visit(Deptment deptment);

}
