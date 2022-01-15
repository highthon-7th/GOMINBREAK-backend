package com.example.gominbreakbackend.domain.sympathy.domain;

import com.example.gominbreakbackend.domain.comment.domain.Comment;
import com.example.gominbreakbackend.domain.post.domain.Post;
import com.example.gominbreakbackend.domain.user.domain.Member;
import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "tbl_sym")
public class Sympathy {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    private Comment comment;
}
