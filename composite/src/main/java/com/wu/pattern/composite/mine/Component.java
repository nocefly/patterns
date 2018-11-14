package com.wu.pattern.composite.mine;

/**
 * @Title: Component
 * @Package: com.wu.pattern.composite.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public abstract class Component {

    public abstract void operation();

    public abstract void add(Component c);

    public abstract void remove(Component c);

}
