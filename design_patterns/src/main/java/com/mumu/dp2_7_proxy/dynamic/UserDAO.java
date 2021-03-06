/*
 * Copyright 2020-2021, 木木996.
 * All Right Reserved.
 */

package com.mumu.dp2_7_proxy.dynamic;

// 具体UserDAO类：真实角色
public class UserDAO implements AbstractUserDAO {

    public boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("张无忌")) {
            System.out.println("查询ID为" + userId + "的用户信息成功！");
            return true;
        } else {
            System.out.println("查询ID为" + userId + "的用户信息失败！");
            return false;
        }
    }
}
