package com.example.yamusic.service.impl;

import com.example.yamusic.dto.UserDto;
import com.example.yamusic.mapper.UserMapper;
import com.example.yamusic.repository.UserRepository;
import com.example.yamusic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class UserServiceImpl implements UserService {
    UserRepository repository;
    UserMapper userMapper;
    @Override
    public List<UserDto> list() {
        return repository.findAll().stream().map(userMapper::toDto).collect(Collectors.toList());
    }
    @Autowired
    public void estUserRepository(UserRepository userRepository){
        this.repository=userRepository;
    }
    @Autowired
    public void estUserMapper(UserMapper userMapper){
        this.userMapper=userMapper;
    }
}
