package com.zeryts.design.template;

/**
 * @author zeryts
 * @description: 模板模式的公共封装
 * -----------------------------------
 * @title: BaseCountCalculatorl
 * @projectName test-jvm
 * @date 2021/3/10 6:01
 */
public abstract class BaseCountCalculatorl {
    /** description: 公共的通用逻辑计算方法
     * @Author: zeryts
     * @email: hezitao@agree.com
     * @Date: 2021/3/10 6:02
     */
    public void calculate(){
        System.out.println("执行公共计算代码");
    }
    /** description: 执行子方法的计算逻辑
     * @Author: zeryts
     * @email: hezitao@agree.com
     * @Date: 2021/3/10 6:02
     */
    protected abstract void calculateSub();

}
