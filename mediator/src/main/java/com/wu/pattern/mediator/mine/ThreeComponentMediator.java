package com.wu.pattern.mediator.mine;

/**
 * @Title: ThreeComponentMediator
 * @Package: com.wu.pattern.mediator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public class ThreeComponentMediator extends Mediator{
    protected Component button;
    protected Component combox;
    protected Component list;

    public void setButton(Component button) {
        this.button = button;
    }

    public void setCombox(Component combox) {
        this.combox = combox;
    }

    public void setList(Component list) {
        this.list = list;
    }

    @Override
    public void onChanged(Component c) {
        if(c==button){
            list.update();
            combox.update();
        }
        else if(c==combox){
            list.update();
        }
        else{
            combox.update();
        }
    }
}
