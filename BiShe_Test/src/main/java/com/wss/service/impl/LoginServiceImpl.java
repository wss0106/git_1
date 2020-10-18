package com.wss.service.impl;

import com.wss.dao.UsersDao;
import com.wss.entity.Users;
import com.wss.service.LoginService;

import java.util.List;

public class LoginServiceImpl implements LoginService {
    @Override
    public Users queryByName(String name) {
        return this.queryByName(name);
    }

    @Override
    public List<Users> queryAll() {
        return null;
    }

}
