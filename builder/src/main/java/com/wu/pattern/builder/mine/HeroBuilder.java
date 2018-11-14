package com.wu.pattern.builder.mine;

/**
 * @Title: Builder
 * @Package: com.wu.pattern.builder
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class HeroBuilder extends Builder{

    public void buildName(){
        System.out.println("build hero name.");
        actor.setName("hero");
    }

    public void buildSkin(){
        System.out.println("build hero skin.");
        actor.setSkin("hero's skin");
    }

    public void buildSkill(){
        System.out.println("build hero skill.");
        actor.setSkill("hero's skill");
    }

}
