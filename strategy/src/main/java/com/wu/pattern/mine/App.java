package com.wu.pattern.mine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double price = 50;
        Ticket studentTicket = new Ticket(new StudentDiscount(),price);
        System.out.println(String.format("%s price, %s after discount.",price,studentTicket.getPrice()));

        Ticket childTicket = new Ticket(new ChildDiscount(),price);
        System.out.println(String.format("%s price, %s after discount.",price,childTicket.getPrice()));

        Ticket vipTicket = new Ticket(new VipDiscount(),price);
        System.out.println(String.format("%s price, %s after discount.",price,vipTicket.getPrice()));

    }
}
