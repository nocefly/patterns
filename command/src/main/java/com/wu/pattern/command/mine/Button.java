package com.wu.pattern.command.mine;

/**
 * @Title: Button
 * @Package: com.wu.pattern.Command.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/13
 * @Version: V1.0
 */
public class Button {
    private String name;
    private Command command;

    public Button(String name, Command command) {
        this.name = name;
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
