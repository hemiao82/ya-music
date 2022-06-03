package com.example.yamusic.mapper;

import com.example.yamusic.dto.UserDto;
import com.example.yamusic.entity.User;
import com.example.yamusic.vo.UserVo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    UserVo toVo(UserDto userDto);
}
