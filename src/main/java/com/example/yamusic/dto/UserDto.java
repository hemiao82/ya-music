package com.example.yamusic.dto;

import com.example.yamusic.vo.RoleVo;
import lombok.Data;

import java.util.List;
@Data
public class UserDto {
    private String id;
    private String username;
    private String nickname;
    private List<RoleVo> roles;
}
