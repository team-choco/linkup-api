package com.kakaotrack.choco.linkupapi.category;

import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollection;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryName;
    @OneToMany(mappedBy = "linkCollection", cascade = CascadeType.REMOVE)
    private List<LinkCollection> linkCollectionList;

    @ManyToOne
    private SiteUser siteUser;
}
