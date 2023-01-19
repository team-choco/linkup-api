package com.kakaotrack.choco.linkupapi.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SiteUser {
    /*
    사이트유저란?
    참고한 서적에 따라서 이어진건데
    그냥 우리 회원정보임
    우리는 회원정보를
    이름
    비밀번호
    이메일

    이걸 id로 관리함.(?아마도)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
}
