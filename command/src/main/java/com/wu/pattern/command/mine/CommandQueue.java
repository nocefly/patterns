package com.wu.pattern.command.mine;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: CommandQueue
 * @Package: com.wu.pattern.command.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/13
 * @Version: V1.0
 */
public class CommandQueue {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void remove(Command command){
        commands.remove(command);
    }

    public void execute(){
        for(Command item:commands){
            item.execute();
        }
    }

}
