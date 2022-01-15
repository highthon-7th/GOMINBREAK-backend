package com.example.gominbreakbackend.domain.comment.domain;

import com.example.gominbreakbackend.domain.post.domain.Post;
import com.example.gominbreakbackend.domain.sympathy.domain.Sympathy;
import com.example.gominbreakbackend.domain.user.domain.Member;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "comment", cascade = CascadeType.REMOVE)
    private final Set<Sympathy> sympathies = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    public Comment addSymCommentCounts(){
        this.symCounts++;
        return this;
    }
}
