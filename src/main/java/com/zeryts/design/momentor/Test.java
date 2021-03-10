package com.zeryts.design.momentor;

/**
 * @author zeryts
 * @description: 备忘录模式测试类
 * -----------------------------------
 * @title: Test
 * @projectName test-jvm
 * @date 2021/3/11 6:57
 */
public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        //准备好中间数据
        originator.prepare();

        //将中间数据保存到备忘录中
        Memento memento = originator.createMemento();

        //将备忘录保存到备忘录管理器中
        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(memento);

        //基于中间数据执行A方法
        originator.executeA();

        //从备忘录中重新获取数据
        memento = caretaker.retriveMemento();

        //将元数据发送到原发送器中
        originator.setMemento(memento);

        originator.executeB();

    }
}
