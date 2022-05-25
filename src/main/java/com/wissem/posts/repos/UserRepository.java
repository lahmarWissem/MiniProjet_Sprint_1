package com.wissem.posts.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wissem.posts.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
