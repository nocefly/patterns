package com.wu.pattern.composite.mine;

/**
 * @Title: Component
 * @Package: com.wu.pattern.composite.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/8/10
 * @Version: V1.0
 */
public class Leaf extends Component{

    public void operation(){
        System.out.println("operation in leaf.");
    }

    public void add(Component c){
        System.out.println("error.");
    }

    public void remove(Component c){
        System.out.println("error.");
    }

}
