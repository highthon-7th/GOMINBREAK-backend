package com.example.gominbreakbackend.domain.user.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RedisHash(value = "refresh_token")
public class RefreshToken implements Serializable {

    @Id
    private String username;

    @Indexed
    private String refreshToken;

    @TimeToLive
    private Long refreshExpiration;

    public RefreshToken update(Long refreshExp) {
        this.refreshExpiration = refreshExp;
        return this;
    }
}
