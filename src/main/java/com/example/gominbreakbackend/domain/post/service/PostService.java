package com.example.gominbreakbackend.domain.post.service;

import com.example.gominbreakbackend.domain.post.domain.Post;
import com.example.gominbreakbackend.domain.post.domain.repository.PostRepository;
import com.example.gominbreakbackend.domain.post.presentation.dto.request.PostRequest;
import com.example.gominbreakbackend.domain.post.presentation.dto.response.PostDetailsResponse;
import com.example.gominbreakbackend.domain.post.presentation.dto.response.PostResponse;
import com.example.gominbreakbackend.domain.user.facade.MemberFacade;
import com.example.gominbreakbackend.global.exception.PostNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public void createPost(PostRequest request){
        postRepository.save(Post.builder()
                        .content(request.getContent())
                        .title(request.getTitle())
                        .member(MemberFacade.getMember())
                        .build());
    }

    public List<PostResponse> getPosts(){
        return postRepository.findAll()
                .stream()
                .map(post -> {
                    PostResponse response = PostResponse.builder()
                            .title(post.getTitle())
                            .content(post.getContent())
                            .name(post.getMember().getName())
                            .build();
                    return response;
                })
                .collect(Collectors.toList());
    }

    public PostDetailsResponse getPost(Integer id){
        return postRepository.findById(id)
                .map(post -> {
                    PostDetailsResponse postDetailsResponse = PostDetailsResponse.builder()
                            .title(post.getTitle())
                            .content(post.getContent())
                            .name(post.getMember().getName())
                            .commentContents(post.getCommentContents())
                            .build();
                    return postDetailsResponse;
                })
                .orElseThrow(() -> PostNotFoundException.EXCEPTION);
    }
}
