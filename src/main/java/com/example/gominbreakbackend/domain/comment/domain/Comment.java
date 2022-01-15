package com.example.gominbreakbackend.domain.comment.domain;

import com.example.gominbreakbackend.domain.post.domain.Post;
import com.example.gominbreakbackend.domain.user.domain.Member;
import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "tbl_comment")
public class Comment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String commentContent;

    private Integer symCounts;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    public Comment addSymCounts(){
        this.symCounts++;
        return this;
    }
}
