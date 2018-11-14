package com.wu.pattern.mediator.mine;

/**
 * @Title: List
 * @Package: com.wu.pattern.mediator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public class List extends Component {
    public List(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update() {
        System.out.println("update list");
    }

    public void select(){
        System.out.println("select list item");
        changeOtherComponent();
    }
}
