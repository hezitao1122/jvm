package com.zeryts.design.visitor;

/**
 * @author zeryts
 * @description: 删除Visitor
 * -----------------------------------
 * @title: RemoveVisitor
 * @projectName test-jvm
 * @date 2021/3/11 7:55
 */
public class RemoveVisitor implements Visitor{

    private Deptment deptment;
    public RemoveVisitor(Deptment deptment){
        this.deptment = deptment;
    }

    @Override
    public void execute() {
        if(deptment.getChildren().size() > 0){
            for (Deptment chilld : deptment.getChildren()) {
                chilld.accept(this);
            }
        }else{
            System.out.println("删除部门节点 " + deptment.getName());

        }
    }

    @Override
    public void visit(Deptment deptment) {
        this.deptment = deptment;
    }
}
