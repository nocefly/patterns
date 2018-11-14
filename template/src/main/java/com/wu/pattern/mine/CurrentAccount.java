package com.wu.pattern.mine;

/**
 * @Title: CurrentAccount
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public class CurrentAccount extends Account {
    @Override
    public boolean validate() {
        return true;
    }

    @Override
    public void calculate() {
        System.out.println("calculate current interest.");
    }

    @Override
    public void show() {
        System.out.println("show current interest.");
    }
}
