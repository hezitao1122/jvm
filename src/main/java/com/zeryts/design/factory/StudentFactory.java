package com.zeryts.design.factory;

/**
 * @author zeryts
 * @description: 制造学生的工厂
 * -----------------------------------
 * @title: StudentFactory
 * @projectName test-jvm
 * @date 2021/3/10 6:15
 */
public class StudentFactory {

    /** description: 初始化一个学生
     * @return: com.zeryts.design.factory.Student
     * @Author: zeryts
     * @email: hezitao@agree.com
     * @Date: 2021/3/10 6:18
     */
    public static Student newInstance(){
        return new ManStudent();
    }


}
