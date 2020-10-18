package com.wss.dao;

import com.wss.entity.Users;

public interface UsersDao {
    /**
     *通过id查询用户信息
     * @param id
     * @return
     */
    Users queryById(int id);

    /**
     * 通过用户名查询
     * @param name
     * @return
     */
    Users queryByName(String name);

}
