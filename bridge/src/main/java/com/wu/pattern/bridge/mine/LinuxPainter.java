package com.wu.pattern.bridge.mine;

/**
 * @Title: Painter
 * @Package: com.wu.pattern.bridge.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class LinuxPainter implements Painter{
    @Override
    public void paint() {
        System.out.println("paint on linux.");
    }
}
