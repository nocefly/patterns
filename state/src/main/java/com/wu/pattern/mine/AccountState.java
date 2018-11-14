package com.wu.pattern.mine;

/**
 * @Title: AccountState
 * @Package: com.wu.pattern.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/11/5
 * @Version: V1.0
 */
public abstract class AccountState{
    protected Account account;

    public AccountState(Account account) {
        this.account = account;
    }

    public abstract void deposite(double amount);

    public abstract void withDraw(double amount);

    public abstract void calculateInterest();

    public void stateCheck(){
        if(account.getBalance()>=0){
            account.setState(new NormalAccountState(account));
            System.out.println("now is normal state.");
        }

        else if(account.getBalance()<0&&account.getBalance()>-2000){
            account.setState(new OverdraftAccountState(account));
            System.out.println("now is overdraft state.");
        }
        else if(account.getBalance()==-2000){
            account.setState(new RestrictedAccountState(account));
            System.out.println("now is restricted state.");
        }
        else
            System.out.println("state limits.");
    }
}
