package com.kakaotrack.choco.linkupapi.linkcollection;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long link_collection_id;
    @Column
    private String link_collection_name;

    @ManyToOne
    private SiteUser siteUser;

    @OneToMany(mappedBy = "link_collection", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties({"link_collection"})
    private List<Link> link_list;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}