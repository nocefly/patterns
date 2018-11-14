package com.wu.pattern.mediator.mine;

/**
 * @Title: ThreeComponentMediator
 * @Package: com.wu.pattern.mediator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public class FourComponentMediator extends ThreeComponentMediator{
    protected Component textBox;
    public void setTextBox(Component textBox) {
        this.textBox = textBox;
    }

    @Override
    public void onChanged(Component c) {
        if(c==button){
            list.update();
            combox.update();
            textBox.update();
        }
        else if(c==combox){
            list.update();
            textBox.update();
        }
        else{
            combox.update();
            textBox.update();
        }
    }
}
