package com.wu.pattern.abstractfactory;

/**
 * @Title: SpringFactory
 * @Package: com.wu.pattern.abstractfactory
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class SummerFactory implements AbstractFactory{

    @Override
    public Button CreateButton() {
        return new SummerButton();
    }

    @Override
    public ComboBox CreateComboBox() {
        return new SummerComboBox();
    }

    @Override
    public TextField CreateTextField() {
        return new SummerTextField();
    }
}
