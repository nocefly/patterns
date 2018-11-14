package com.wu.pattern.observer.mine;

/**
 * @Title: ConcreteAllyCenter
 * @Package: com.wu.pattern.observer.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/30
 * @Version: V1.0
 */
public class ConcreteAllyCenter extends AllyCenter{
    @Override
    public void join(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void leave(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String name) {
        for(Observer item:observers)
            if(item.getName().equalsIgnoreCase(name)==false)
                item.AllyBeAttackedUpdate();
    }
}
