package com.docker.demo.controller;

import com.docker.demo.entity.User;
import com.docker.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody User user){
        String response= userService.addUser(user);
        return ResponseEntity.ok().body(response);

    }

    @GetMapping("/get")
    public ResponseEntity<List<User>> getUsers(){
        List<User> users= userService.getUsers();
        return ResponseEntity.ok().body(users);

    }
}
