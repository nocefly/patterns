package com.wu.pattern.bridge.mine;

/**
 * @Title: Image
 * @Package: com.wu.pattern.bridge.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class JpegImage extends Image{

    @Override
    public void format() {
        System.out.println("jpeg format.");
    }
}
