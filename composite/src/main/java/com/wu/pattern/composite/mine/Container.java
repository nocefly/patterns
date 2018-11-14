package com.wu.pattern.composite.mine;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Component
 * @Package: com.wu.pattern.composite.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class Container extends Component{

    private List<Component> componentList = new ArrayList<>();

    public void operation(){
        for(Component c:componentList)
            c.operation();
    }

    public void add(Component c){
        componentList.add(c);
        System.out.println("add component.");
    }

    public void remove(Component c){
        componentList.remove(c);
        System.out.println("remove component.");
    }

}
