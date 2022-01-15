package com.example.gominbreakbackend.domain.comment.domain.repository;

import com.example.gominbreakbackend.domain.comment.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
