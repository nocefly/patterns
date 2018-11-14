package com.wu.pattern.prototype;

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
        WeeklyLog weeklyLog = new WeeklyLog();
        weeklyLog.setName("database");
        weeklyLog.setContent("logs in database");
        weeklyLog.setDate("2018-08-10");
        weeklyLog.setAttachment(new Attachment("1","attachment 1"));
        WeeklyLog cloneWeeklyLog = weeklyLog.clone();
        //==比较引用地址是否相同
        System.out.println("clone object == :" + (cloneWeeklyLog==weeklyLog));
        System.out.println("attachment clone object == :" + (cloneWeeklyLog.getAttachment()==weeklyLog.getAttachment()));

        //深度复制
        DeepCloneLog deepCloneLog = new DeepCloneLog();
        deepCloneLog.setName("database");
        deepCloneLog.setContent("logs in database");
        deepCloneLog.setDate("2018-08-10");
        deepCloneLog.setAttachment(new Attachment("1","attachment 1"));
        DeepCloneLog cloneDeepCloneLog = deepCloneLog.clone();

        //==比较引用地址是否相同
        System.out.println("clone object == :" + (deepCloneLog==cloneDeepCloneLog));
        System.out.println("attachment clone object == :" + (deepCloneLog.getAttachment()==cloneDeepCloneLog.getAttachment()));

    }
}
