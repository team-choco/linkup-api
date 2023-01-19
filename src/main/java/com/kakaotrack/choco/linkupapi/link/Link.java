package com.kakaotrack.choco.linkupapi.link;

import com.kakaotrack.choco.linkupapi.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String linkTitle;
    private String linkContent;
    private String linkAddress;

    @ManyToOne
    private SiteUser siteUser;

}