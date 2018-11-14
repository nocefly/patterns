package com.wu.pattern.command.mine;

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
        Button button1 = new Button("help", new HelpCommand());
        Button button2 = new Button("minimize", new MinimizeCommand());

        button1.call();
        button2.call();

        //命令队列
        CommandsInvoker commandsInvoker = new CommandsInvoker();
        CommandQueue commandQueue = new CommandQueue();
        commandQueue.addCommand(new MinimizeCommand());
        commandQueue.addCommand(new HelpCommand());
        commandsInvoker.setCommandQueue(commandQueue);
        commandsInvoker.call();
    }
}
