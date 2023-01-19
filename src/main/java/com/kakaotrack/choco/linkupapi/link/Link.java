package com.kakaotrack.choco.linkupapi.link;

import com.kakaotrack.choco.linkupapi.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Link {
    /*
    링크 생성시 필요한 내용들
    순서대로
    아이디
    링크제목
    링크 설명 내용
    링크 주소
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String linkTitle;
    private String linkContent;
    private String linkAddress;

    @ManyToOne
    private SiteUser siteUser;

}