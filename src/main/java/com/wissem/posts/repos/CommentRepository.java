package com.wissem.posts.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wissem.posts.entities.*;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}



