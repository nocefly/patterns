package com.wu.pattern.builder.mine;

/**
 * @Title: Builder
 * @Package: com.wu.pattern.builder
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public abstract class Builder {

    protected Actor actor = new Actor();

    public abstract void buildName();
    public abstract void buildSkin();
    public abstract void buildSkill();

    public Actor getActor(){return actor;}

}
