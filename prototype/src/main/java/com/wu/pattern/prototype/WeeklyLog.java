package com.wu.pattern.prototype;

/**
 * @Title: WeeklyLog
 * @Package: com.wu.pattern.prototype
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
class WeeklyLog implements Cloneable
{
    private  String name;
    private  String date;
    private  String content;
    private Attachment attachment;

    public  void setName(String name) {
        this.name  = name;
    }
    public  void setDate(String date) {
        this.date  = date;
    }
    public  void setContent(String content) {
        this.content  = content;
    }
    public  String getName() {
        return  (this.name);
    }
    public  String getDate() {
        return  (this.date);
    }
    public  String getContent() {
        return  (this.content);
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    //克隆方法clone()，此处使用Java语言提供的克隆机制
    public WeeklyLog clone()
    {
        Object obj = null;
        try
        {
            obj = super.clone();
            return (WeeklyLog)obj;
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("不支持复制！");
            return null;
        }
    }
}