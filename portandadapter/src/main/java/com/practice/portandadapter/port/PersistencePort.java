package com.practice.portandadapter.port;

import com.practice.portandadapter.domain.User;

public interface PersistencePort {
    void userSave(User user);

    User findByUsername(String username);
}
