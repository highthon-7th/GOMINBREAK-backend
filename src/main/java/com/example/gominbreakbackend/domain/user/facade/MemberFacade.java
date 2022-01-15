package com.example.gominbreakbackend.domain.user.facade;

import com.example.gominbreakbackend.domain.user.domain.Member;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class MemberFacade {

    public static Member getMember(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || authentication.getPrincipal() == null
                || !(authentication.getPrincipal() instanceof Member))
            return null;

        return (Member) authentication.getPrincipal();
    }

    public static Integer getMemberId() {
        if (getMember() == null) {
            return null;
        }

        return getMember().getId();
    }
}

