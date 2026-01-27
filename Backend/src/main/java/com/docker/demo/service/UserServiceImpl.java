package com.docker.demo.service;

import com.docker.demo.entity.User;
import com.docker.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

   @Autowired
   private UserRepository userRepository;


    /**
     * @param user
     * @return
     */
    @Override
    public String addUser(User user) {
        userRepository.save(user);
        return "User Added Successfully";
    }

    /**
     *
     * @return
     */
    @Override
    public List<User> getUsers() {
       return userRepository.findAll();
    }
}
