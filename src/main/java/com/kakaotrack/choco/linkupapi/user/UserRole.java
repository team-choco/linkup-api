package com.kakaotrack.choco.linkupapi.user;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}
/*
여기 부분은 모르겠음 일단 보라색부분이 하이퍼링크같은 느낌이었음.
 */