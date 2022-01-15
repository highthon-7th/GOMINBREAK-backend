package com.example.gominbreakbackend.domain.post.presentation;

import com.example.gominbreakbackend.domain.post.presentation.dto.request.PostRequest;
import com.example.gominbreakbackend.domain.post.presentation.dto.response.PostDetailsResponse;
import com.example.gominbreakbackend.domain.post.presentation.dto.response.PostResponse;
import com.example.gominbreakbackend.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gomin")
public class PostController {

    private final PostService postService;

    @PostMapping("")
    public void createPost(@RequestBody @Valid PostRequest request){
        postService.createPost(request);
    }

    @GetMapping("")
    public List<PostResponse> getPosts(){
        return postService.getPosts();
    }

    @GetMapping("/{gomin-id}")
    public PostDetailsResponse getPost(@PathVariable(name = "gomin-id") Integer id){
        return postService.getPost(id);
    }
}
