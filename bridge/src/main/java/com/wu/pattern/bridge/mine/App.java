package com.wu.pattern.bridge.mine;

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
        Image image = new BmpImage();
        image.setPainter(new LinuxPainter());
        image.draw();

        image = new JpegImage();
        image.setPainter(new WindowsPainter());
        image.draw();

        image = new GifImage();
        image.setPainter(new LinuxPainter());
        image.draw();

        //桥接模式和适配器模式结合
        image.setPainter(new MacPainter());
        image.draw();

    }
}
