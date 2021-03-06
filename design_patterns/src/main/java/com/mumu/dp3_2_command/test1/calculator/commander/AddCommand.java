/*
 * Copyright 2020-2021, 木木996.
 * All Right Reserved.
 */

package com.mumu.dp3_2_command.test1.calculator.commander;

import com.mumu.dp3_2_command.test1.calculator.Adder;

// 具体命令类
public class AddCommand extends AbstractCommand {
    private Adder adder = new Adder();
    private int value;

    // 实现抽象命令类中声明的execute()方法，调用加法类的加法操作
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    // 实现抽象命令类中声明的undo()方法，通过加一个相反数来实现加法的逆向操作
    public int undo() {
        return adder.add(-value);
    }
}
