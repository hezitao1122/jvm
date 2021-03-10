package com.zeryts.design.prototype;

/**
 * @author zeryts
 * @description: 属性
 * -----------------------------------
 * @title: Component
 * @projectName test-jvm
 * @date 2021/3/10 20:07
 */
public class Component {

    private String name;

    public Component(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Component(name);
    }
}
