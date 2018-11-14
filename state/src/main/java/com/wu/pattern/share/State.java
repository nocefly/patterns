package com.wu.pattern.share;

/**
 * @Title: State
 * @Package: com.wu.pattern.share
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/11/6
 * @Version: V1.0
 */
public abstract class State {
    public abstract void on(Switch aSwitch);
    public abstract void off(Switch aSwitch);

}
