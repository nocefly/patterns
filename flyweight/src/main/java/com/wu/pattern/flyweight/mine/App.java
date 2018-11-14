package com.wu.pattern.flyweight.mine;

/**
 * @Title: App
 * @Package: com.wu.pattern.simplefactory
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class App {
    public static void main(String[] args){
        Chessman w1 = ChessmanFactory.getInstance().getChessman("w");
        Chessman w2 = ChessmanFactory.getInstance().getChessman("w");
        System.out.println("w1 == w2 ? " + (w1==w2));
        Chessman b1 = ChessmanFactory.getInstance().getChessman("b");
        Chessman b2 = ChessmanFactory.getInstance().getChessman("b");
        System.out.println("b1 == b2 ? " + (b1==b2));
    }
}
