package com.example.gominbreakbackend.domain.post.domain.repository;

import com.example.gominbreakbackend.domain.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Integer> {
    Optional<Post> findMemberById(Integer id);

    List<Post> findPostByMemberId(Integer id);
}
