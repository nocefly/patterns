package com.wu.pattern.bridge.mine;

/**
 * @Title: Painter
 * @Package: com.wu.pattern.bridge.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class MacPainter implements Painter{

    private MacAdaptee macAdaptee = new MacAdaptee();

    @Override
    public void paint() {
        macAdaptee.paint();
    }
}
