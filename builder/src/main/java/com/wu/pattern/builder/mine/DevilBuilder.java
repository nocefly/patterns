package com.wu.pattern.builder.mine;

/**
 * @Title: Builder
 * @Package: com.wu.pattern.builder
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class DevilBuilder extends Builder{

    public void buildName(){
        System.out.println("build devil name.");
        actor.setName("devil");
    }

    public void buildSkin(){
        System.out.println("build devil skin.");
        actor.setSkin("devil's skin");
    }

    public void buildSkill(){
        System.out.println("build devil skill.");
        actor.setSkill("devil's skill");
    }

}
