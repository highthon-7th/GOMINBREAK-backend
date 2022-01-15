package com.example.gominbreakbackend.domain.post.service;

import com.example.gominbreakbackend.domain.post.domain.Post;
import com.example.gominbreakbackend.domain.post.domain.repository.PostRepository;
import com.example.gominbreakbackend.domain.post.presentation.dto.request.PostRequest;
import com.example.gominbreakbackend.domain.post.presentation.dto.response.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public void createPost(PostRequest request){
        postRepository.save(Post.builder()
                        .title(request.getTitle())
                        .content(request.getContents())
                        .build());
    }

    public List<PostResponse> getPosts(){
        return null;
    }

    public PostResponse getPost(Integer id){
        return null;
    }
}
