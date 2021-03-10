package com.zeryts.design.composite;

/**
 * @author zeryts
 * @description: 组合模式的测试类
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/11 5:38
 */
public class Test {

    public static void main(String[] args) {
        Deptment parent1 = new Deptment("父部门1");
        Deptment son1 = new Deptment("子部门1");
        Deptment son2 = new Deptment("子部门2");
        Deptment sonson1 = new Deptment("子子部门1");
        son1.addChildren(sonson1);
        parent1.addChildren(son1);
        parent1.addChildren(son2);


        parent1.remove();
    }

}
