package com.practice.portandadapter.Controller;

import com.practice.portandadapter.adapter.persistence.mysql.PersistenceMySqlUserAdapter;
import com.practice.portandadapter.domain.User;
import com.practice.portandadapter.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private PersistenceMySqlUserAdapter persistenceMySqlUserAdapter;

    @PostMapping("/users")
    public void saveUser(@RequestBody UserDto userDto) {
        User user = UserDto.toUser(userDto);
        persistenceMySqlUserAdapter.userSave(user);
    }

}
