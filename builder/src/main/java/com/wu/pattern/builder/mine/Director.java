package com.wu.pattern.builder.mine;

/**
 * @Title: Director
 * @Package: com.wu.pattern.builder
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class Director {

    public Actor create(Builder builder){
        builder.buildName();
        builder.buildSkin();
        builder.buildSkill();
        return builder.getActor();
    }

}
