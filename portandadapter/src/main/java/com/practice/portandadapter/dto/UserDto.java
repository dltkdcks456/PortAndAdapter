package com.practice.portandadapter.dto;

import com.practice.portandadapter.domain.User;
import lombok.Data;

@Data
public class UserDto {
    private String username;
    private int age;

    public static User toUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setAge(userDto.getAge());
        return user;
    }
}
