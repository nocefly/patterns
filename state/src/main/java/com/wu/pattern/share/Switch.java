package com.wu.pattern.share;

/**
 * @Title: Switch
 * @Package: com.wu.pattern.share
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/11/6
 * @Version: V1.0
 */
public class Switch {
    private static State state;
    private static State onState;
    private static State offState;

    private String name;
    public Switch(String name) {
        this.name = name;
        onState = new OnState();
        offState = new OffState();
        this.state = onState;
    }

    public String getName() {
        return name;
    }

    public void setState(String stateName){
        if(stateName.equalsIgnoreCase("on")){
            state = onState;
            System.out.println(name + " set on state.");
        }
        else if(stateName.equalsIgnoreCase("off")){
            state = offState;
            System.out.println(name + " set off state.");
        }
        else
            throw new IllegalArgumentException("illegal parameter: " + stateName);
    }

    public void on(){
        state.on(this);
    }


    public void off(){
        state.off(this);
    }
}
