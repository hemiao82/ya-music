package com.example.yamusic.controller;

import com.example.yamusic.mapper.UserMapper;
import com.example.yamusic.service.UserService;
import com.example.yamusic.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    UserService userService;
    UserMapper userMapper;
    @GetMapping("/")
    List<UserVo> list() {
        return userService.list().stream().map(userMapper::toVo).collect(Collectors.toList());
    }
    @Autowired
    public void setUserService(UserService userService){
        this.userService=userService;
    }
    @Autowired
    public void estUserMapper(UserMapper userMapper){
        this.userMapper=userMapper;
    }
}
