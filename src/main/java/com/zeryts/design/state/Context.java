package com.zeryts.design.state;

/**
 * @author zeryts
 * @description: 核心类
 * -----------------------------------
 * @title: Context
 * @projectName test-jvm
 * @date 2021/3/11 6:29
 */
public class Context {

    private State state;

    public void execute(int styleType){
        if(styleType == 1){
            this.state = new NewState();
        }else if(styleType == 2){
            this.state = new LoadingState();
        }else if(styleType == 3){
            this.state = new AlreadyState();
        }else{
            this.state = new FinishedState();
        }

        state.execute();
    }

}
