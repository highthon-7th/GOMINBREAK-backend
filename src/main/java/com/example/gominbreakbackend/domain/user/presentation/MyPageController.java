package com.example.gominbreakbackend.domain.user.presentation;

import com.example.gominbreakbackend.domain.user.presentation.dto.response.MemberInfoResponse;
import com.example.gominbreakbackend.domain.user.presentation.dto.response.MyPageResponse;
import com.example.gominbreakbackend.domain.user.service.MyPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MyPageController {

    private final MyPageService myPageService;

    @GetMapping("/my/page")
    public List<MyPageResponse> myPosts(){
        return myPageService.myPage();
    }

    @GetMapping("/info")
    public MemberInfoResponse memberInfo(){
        return myPageService.memberInfo();
    }
}
