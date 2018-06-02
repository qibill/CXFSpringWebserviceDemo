package com.qibill.service;

import javax.jws.WebService;

import com.qibill.pojo.User;

@WebService
public interface UserService {

    User getUser(String name);
}
