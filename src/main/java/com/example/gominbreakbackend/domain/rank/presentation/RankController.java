package com.example.gominbreakbackend.domain.rank.presentation;

import com.example.gominbreakbackend.domain.rank.presentation.dto.RankMemberResponse;
import com.example.gominbreakbackend.domain.rank.presentation.dto.RankSchoolResponse;
import com.example.gominbreakbackend.domain.rank.service.RankService;
import com.example.gominbreakbackend.domain.school.domain.School;
import com.example.gominbreakbackend.domain.user.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RankController {

    private final RankService rankService;

    @GetMapping("/member/rank")
    public List<RankMemberResponse> memberRank(){
        return rankService.memberRank();
    }

    @GetMapping("/school/rank")
    public List<RankSchoolResponse> schoolRank(){
        return rankService.schoolRank();
    }
}
