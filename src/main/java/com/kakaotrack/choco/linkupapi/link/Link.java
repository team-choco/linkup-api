package com.kakaotrack.choco.linkupapi.link;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollection;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "links")
@NoArgsConstructor
public class Link {

    @Id
    @Column(name="link_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int linkId;
    @Column(name="link_title")
    private String linkTitle;
    @Column(name="link_content")
    private String linkContent;
    @Column(name="link_address")
    private String linkAddress;

    @ManyToOne
    private SiteUser siteUser;

    @ManyToOne
    @JoinColumn(name="link_collection_id")
    @JsonIgnore
    private LinkCollection linkCollection;
}