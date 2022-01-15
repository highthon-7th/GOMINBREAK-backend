package com.example.gominbreakbackend.global.security.config;

import com.example.gominbreakbackend.global.error.ExceptionHandlerFilter;
import com.example.gominbreakbackend.global.security.jwt.JwtTokenFilter;
import com.example.gominbreakbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@RequiredArgsConstructor
public class FilterConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    private final JwtTokenProvider jwtTokenProvider;

    public void configure(HttpSecurity security) {
        JwtTokenFilter jwtTokenFilter = new JwtTokenFilter(jwtTokenProvider);
        ExceptionHandlerFilter exceptionHandlerFilter = new ExceptionHandlerFilter();

        security.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
        security.addFilterBefore(exceptionHandlerFilter, JwtTokenFilter.class);
    }
}
