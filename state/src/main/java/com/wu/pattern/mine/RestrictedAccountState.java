package com.wu.pattern.mine;

/**
 * @Title: AccountState
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/11/5
 * @Version: V1.0
 */
public class RestrictedAccountState extends AccountState{
    public RestrictedAccountState(Account account) {
        super(account);
    }

    @Override
    public void deposite(double amount) {
        System.out.println(String.format("Restricted state: deposite %s.",amount));
        account.setBalance(account.getBalance()+amount);
        stateCheck();
    }

    @Override
    public void withDraw(double amount) {
        System.out.println(String.format("Restricted state: can not withDraw %s.",amount));
    }

    @Override
    public void calculateInterest() {
        System.out.println("Restricted state, no interest.");
    }

}
