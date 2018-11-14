package com.wu.pattern.mediator.mine;


/**
 * @Title: App
 * @Package: com.wu.pattern.simplefactory
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class App {
    public static void main(String[] args){
        ThreeComponentMediator threeMediator = new ThreeComponentMediator();
        Component button1 = new Button(threeMediator);
        Component combox1 = new Combox(threeMediator);
        Component list1 = new List(threeMediator);
        threeMediator.setButton(button1);
        threeMediator.setCombox(combox1);
        threeMediator.setList(list1);

        ((Button) button1).addClick();
        ((Combox) combox1).select();
        ((List) list1).select();

        System.out.println("----------------------------------------");
        FourComponentMediator fourMediator = new FourComponentMediator();
        Component button2 = new Button(fourMediator);
        Component combox2 = new Combox(fourMediator);
        Component list2 = new List(fourMediator);
        Component textBox2 = new TextBox(fourMediator);

        fourMediator.setButton(button2);
        fourMediator.setCombox(combox2);
        fourMediator.setList(list2);
        fourMediator.setTextBox(textBox2);

        ((Button) button2).addClick();
        ((Combox) combox2).select();
        ((List) list2).select();

    }
}
