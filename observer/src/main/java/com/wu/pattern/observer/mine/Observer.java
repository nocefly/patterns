package com.wu.pattern.observer.mine;

/**
 * @Title: Observer
 * @Package: com.wu.pattern.observer.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/30
 * @Version: V1.0
 */
public abstract class Observer {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void AllyBeAttackedUpdate();

    public abstract void beAttacked(AllyCenter allyCenter);

}
