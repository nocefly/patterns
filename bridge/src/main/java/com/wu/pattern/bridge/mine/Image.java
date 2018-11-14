package com.wu.pattern.bridge.mine;

/**
 * @Title: Image
 * @Package: com.wu.pattern.bridge.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public abstract class Image {
    private Painter painter;

    public void setPainter(Painter painter){
        this.painter = painter;
    }

    public abstract void format();

    public void draw(){
        format();
        painter.paint();
    }
}
