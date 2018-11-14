package com.wu.pattern.observer.mine;

/**
 * @Title: Player
 * @Package: com.wu.pattern.observer.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/30
 * @Version: V1.0
 */
public class Player extends Observer {

    public Player(String name) {
        super(name);
    }

    @Override
    public void AllyBeAttackedUpdate() {
        System.out.println(getName()+ " roger that.");
    }

    @Override
    public void beAttacked(AllyCenter allyCenter) {
        allyCenter.notifyObserver(getName());
    }
}
