package com.wu.pattern.command.mine;

/**
 * @Title: Command
 * @Package: com.wu.pattern.Command.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/13
 * @Version: V1.0
 */
public class MinimizeCommand extends Command{
    private MinimizeHandler minimizeHandler;

    public MinimizeCommand() {
        this.minimizeHandler = new MinimizeHandler();
    }

    public void execute(){
        minimizeHandler.handle();
    }
}
