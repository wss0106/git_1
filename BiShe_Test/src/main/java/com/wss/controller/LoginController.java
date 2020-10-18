package com.wss.controller;

import com.wss.entity.Users;
import com.wss.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class LoginController {
    private LoginService loginService;

    @RequestMapping(value="/QueryByLoginname")
    public Users QueryByLoginName(@RequestBody String name){return this.loginService.queryByName(name);}

    /**
     * 注册
     * @return
     */
    @PostMapping("InsertUser")
    public String InsertUser(){
        BsPassword bsPassword = RegisterThreadLocal.get();
        System.out.println(bsPassword.getBsLastloginip());
        bsPasswordService.insert(bsPassword);
        return "login";
    }
}
