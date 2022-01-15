package com.example.gominbreakbackend.domain.comment.domain.repository;

import com.example.gominbreakbackend.domain.comment.domain.Comment;
import com.example.gominbreakbackend.domain.comment.presentation.dto.request.CommentRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findByPostId(Integer id);
}
