package com.practice.portandadapter.adapter.persistence.mysql;

import com.practice.portandadapter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
