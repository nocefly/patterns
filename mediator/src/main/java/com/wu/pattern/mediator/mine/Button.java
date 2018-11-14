package com.wu.pattern.mediator.mine;

/**
 * @Title: Button
 * @Package: com.wu.pattern.mediator.mine
 * @Description: TODO（添加描述）
 * @Author: Wujiong
 * @Data: 2018/10/25
 * @Version: V1.0
 */
public class Button extends Component {
    public Button(Mediator mediator) {
        super(mediator);

    }

    public void addClick(){
        System.out.println("add click to add items.");
        changeOtherComponent();
    }

    @Override
    public void update() {
        throw new RuntimeException("this method can not be called.");
    }
}
