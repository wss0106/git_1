package com.wss.service;

import com.wss.entity.Users;

import java.util.List;

public interface LoginService {
    Users queryByName(String Name);
    List<Users> queryAll( );
}
