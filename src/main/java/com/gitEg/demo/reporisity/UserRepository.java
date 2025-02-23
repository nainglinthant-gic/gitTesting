package com.gitEg.demo.reporisity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gitEg.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
