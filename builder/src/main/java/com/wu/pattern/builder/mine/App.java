package com.wu.pattern.builder.mine;

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
        Director director = new Director();
        Builder hero = new HeroBuilder();
        director.create(hero);

        Builder devil = new DevilBuilder();
        director.create(devil);
    }
}
