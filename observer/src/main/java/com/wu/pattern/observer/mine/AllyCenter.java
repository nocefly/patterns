package com.wu.pattern.observer.mine;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Clown
 * @Package: com.wu.pattern.observer.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/30
 * @Version: V1.0
 */
public abstract class AllyCenter {
    protected List<Observer> observers = new ArrayList<>();
    public abstract void join(Observer observer);
    public abstract void leave(Observer observer);
    public abstract void notifyObserver(String name);
}
