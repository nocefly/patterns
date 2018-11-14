package com.wu.pattern.command.mine;

/**
 * @Title: Command
 * @Package: com.wu.pattern.Command.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/13
 * @Version: V1.0
 */
public class HelpCommand extends Command{
    private HelpHandler helpHandler;

    public HelpCommand() {
        this.helpHandler = new HelpHandler();
    }

    public void execute(){
        helpHandler.handle();
    }
}
