package com.wu.pattern.command.mine;

/**
 * @Title: CommandsInvoker
 * @Package: com.wu.pattern.command.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/13
 * @Version: V1.0
 */
public class CommandsInvoker {
    private CommandQueue commandQueue;

    public void setCommandQueue(CommandQueue commandQueue){
        this.commandQueue=commandQueue;
    }

    public void call(){
        commandQueue.execute();
    }
}
