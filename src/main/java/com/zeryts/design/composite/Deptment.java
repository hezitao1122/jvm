package com.zeryts.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zeryts
 * @description: 部门
 * -----------------------------------
 * @title: Deptment
 * @projectName test-jvm
 * @date 2021/3/11 5:37
 */
public class Deptment {

    private String name;

    private List<Deptment> children = new ArrayList<>();

    public Deptment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addChildren(Deptment deptment) {
        children.add(deptment);
    }

    public void remove() {
        if (children == null) {
            return;
        }
        if (children.size() > 0){
            for (Deptment dept : children) {
                dept.remove();
            }
        }
    }

    public List<Deptment> getChildren() {
        return children;
    }
}
