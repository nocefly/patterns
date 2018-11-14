package com.wu.pattern.mine;

/**
 * @Title: Account
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public abstract class Account {

    public abstract boolean validate();

    public abstract void calculate();

    public abstract void show();

    public void handle(){
        if(false==validate()){
            System.out.println("validate error, returns without handle.");
            return;
        }

        calculate();
        show();
    }

}
