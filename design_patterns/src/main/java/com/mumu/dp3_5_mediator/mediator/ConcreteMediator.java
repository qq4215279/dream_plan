/*
 * Copyright 2020-2021, 木木996.
 * All Right Reserved.
 */

package com.mumu.dp3_5_mediator.mediator;

import com.mumu.dp3_5_mediator.colleague.*;

// 具体中介者
public class ConcreteMediator extends Mediator {
    // 维持对各个同事对象的引用
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;

    // 封装同事对象之间的交互
    public void componentChanged(Component c) {
        // 单击按钮
        if (c == addButton) {
            System.out.println("--单击增加按钮--");
            list.update();
            cb.update();
            userNameTextBox.update();
        } else if (c == list) { // 从列表框选择客户
            System.out.println("--从列表框选择客户--");
            cb.select();
            userNameTextBox.setText();
        } else if (c == cb) {  // 从组合框选择客户
            System.out.println("--从组合框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
    }
}
