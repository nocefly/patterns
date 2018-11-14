package com.wu.pattern.observer.mine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Player player1 = new Player("zhang");
        Player player2 = new Player("ding");
        Player player3 = new Player("wu");
        AllyCenter allyCenter = new ConcreteAllyCenter();
        allyCenter.join(player1);
        allyCenter.join(player2);
        allyCenter.join(player3);
        player1.beAttacked(allyCenter);
    }
}
