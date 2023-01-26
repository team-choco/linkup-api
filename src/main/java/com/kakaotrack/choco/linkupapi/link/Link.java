package com.kakaotrack.choco.linkupapi.link;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String link_title;
    @Column
    private String link_content;
    @Column
    private String link_address;

    @ManyToOne
    private SiteUser siteUser;

    @ManyToOne
    @JoinColumn(name="link_collection_id")
    private LinkCollection link_collection;
}