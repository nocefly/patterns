package com.wu.pattern.mine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Account acc = new Account(0.0);
        acc.deposite(1000.0);
        acc.withDraw(2000.0);
        acc.deposite(3000.0);
        acc.withDraw(4000);
        acc.withDraw(1000);
        acc.calculateInterest();
    }
}
