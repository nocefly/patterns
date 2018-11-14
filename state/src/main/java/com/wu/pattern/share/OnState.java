package com.wu.pattern.share;

/**
 * @Title: State
 * @Package: com.wu.pattern.share
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/11/6
 * @Version: V1.0
 */
public class OnState extends State{

    public void on(Switch aSwitch){
        System.out.println(aSwitch.getName() + " already on.");
    }

    public void off(Switch aSwitch){
        System.out.println(aSwitch.getName() + " turn off.");
        aSwitch.setState("off");
    }

}
