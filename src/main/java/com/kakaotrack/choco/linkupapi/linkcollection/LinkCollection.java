package com.kakaotrack.choco.linkupapi.linkcollection;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kakaotrack.choco.linkupapi.category.Category;
import com.kakaotrack.choco.linkupapi.link.Link;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "link_collection")
public class LinkCollection {
    @Id
    @Column(name = "link_collection_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int linkCollectionId;
    @Column(name = "link_collection_name")
    private String linkCollectionName;

    @ManyToOne
    private SiteUser siteUser;

    @OneToMany(mappedBy = "linkCollection", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties({"link_collection"})
    @JsonIgnore
    private List<Link> linkList;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}