package com.wu.pattern.mediator.mine;

/**
 * @Title: Component
 * @Package: com.wu.pattern.mediator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public abstract class Component {

    private Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void update();

    protected void changeOtherComponent(){
        mediator.onChanged(this);
    }
}
