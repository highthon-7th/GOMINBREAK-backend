package com.example.gominbreakbackend.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;

import javax.annotation.security.DenyAll;
import javax.persistence.Entity;
import java.io.Serializable;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
