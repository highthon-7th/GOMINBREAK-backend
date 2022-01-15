package com.example.gominbreakbackend.domain.post.domain.repository;

import com.example.gominbreakbackend.domain.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
