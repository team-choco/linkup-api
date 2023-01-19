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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String linkCollectionName;
    @ManyToOne
    private SiteUser siteUser;
    @OneToMany(mappedBy = "link",cascade = CascadeType.REMOVE)
    private List<Link> linkList;
}
