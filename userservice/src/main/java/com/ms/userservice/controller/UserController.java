package com.ms.userservice.controller;

import com.ms.userservice.entity.UserInfo;
import com.ms.userservice.jpa.UserInfoJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserInfoJpa userRepo;

    @GetMapping("/users")
    public ResponseEntity<List<UserInfo>> getAllUser(){
        return ResponseEntity.ok(userRepo.findAll());
    }
    @PostMapping("/user")
    public ResponseEntity<UserInfo> addUser(@RequestBody UserInfo userInfo) {
        userInfo.setId(UUID.randomUUID().toString());
        return ResponseEntity.ok(userRepo.save(userInfo));
    }
}
