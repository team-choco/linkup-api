package com.kakaotrack.choco.linkupapi.linkcollection;

import com.kakaotrack.choco.linkupapi.link.Link;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class LinkCollection {
    /*
    링크 모음을 만들 때 생성해야 하는 것 같음.
    링크 모음 이름
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String linkCollectionName;
    @ManyToOne
    private SiteUser siteUser;
    @OneToMany(mappedBy = "link",cascade = CascadeType.REMOVE)
    private List<Link> linkList;
}
