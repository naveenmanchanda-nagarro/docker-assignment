package com.docker.demo.service;

import com.docker.demo.entity.User;

import java.util.List;

public interface UserService {

    String addUser(User user);

    List<User> getUsers();


}
