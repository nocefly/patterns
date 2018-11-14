package com.wu.pattern.mine;

/**
 * @Title: Account
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/11/5
 * @Version: V1.0
 */
public class Account {
    private double balance;
    private AccountState state;

    public Account(double balance) {
        this.balance = balance;
        this.state = new NormalAccountState(this); //设置初始状态
        System.out.println("initial balance: " + balance);
        System.out.println("---------------------------------------------");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposite(double amount){
        state.deposite(amount);
    }

    public void withDraw(double amount){
        state.withDraw(amount);
    }

    public void calculateInterest(){
        state.calculateInterest();
    }

}
