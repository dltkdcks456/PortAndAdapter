package com.practice.portandadapter.adapter.persistence.mysql;

import com.practice.portandadapter.domain.User;
import com.practice.portandadapter.port.PersistencePort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PersistenceMySqlUserAdapter implements PersistencePort {

    @Autowired
    private MySqlUserRepository userRepository;

    @Override
    public void userSave(User user) {
        log.info("username: {} == age: {}", user.getUsername(), user.getAge());
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
