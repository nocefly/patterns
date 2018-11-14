package com.wu.pattern.mediator.mine;

/**
 * @Title: Combox
 * @Package: com.wu.pattern.mediator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public class Combox extends Component {
    public Combox(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update() {
        System.out.println("update Combox");
    }

    public void select() {
        System.out.println("select Combox");
        changeOtherComponent();
    }

}
