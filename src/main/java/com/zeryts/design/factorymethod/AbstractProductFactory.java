package com.zeryts.design.factorymethod;

/**
 * @author zeryts
 * @description: 抽象的公共工厂
 * -----------------------------------
 * @title: AbstractProductFactory
 * @projectName test-jvm
 * @date 2021/3/10 6:30
 */
public abstract class AbstractProductFactory {

    /** description: 执行方法
     * @return: com.zeryts.design.factorymethod.Producut
     * @Author: zeryts
     * @email: hezitao@agree.com
     * @Date: 2021/3/10 6:33
     */
    public Producut create(){
        commonCreate();
        return selfCreate();
    }

    /** description: 生产的通用逻辑
     * @Author: zeryts
     * @email: hezitao@agree.com
     * @Date: 2021/3/10 6:32
     */
    public void commonCreate(){
        System.out.println("通用逻辑");
    }
    /** description: 生产的子类辑
     * @Author: zeryts
     * @email: hezitao@agree.com
     * @Date: 2021/3/10 6:32
     */
    protected abstract Producut selfCreate();
}
