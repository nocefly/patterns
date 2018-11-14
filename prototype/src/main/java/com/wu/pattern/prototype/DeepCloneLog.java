package com.wu.pattern.prototype;

import java.io.*;

/**
 * @Title: DeepCloneLog
 * @Package: com.wu.pattern.prototype
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class DeepCloneLog implements Serializable {
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

    public DeepCloneLog clone() {
        try (
                ByteArrayOutputStream bao = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bao)) {
            oos.writeObject(this);
            ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ooi = new ObjectInputStream(bai);
            return (DeepCloneLog)ooi.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
