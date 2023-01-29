package com.kakaotrack.choco.linkupapi.category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollection;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "category")
@NoArgsConstructor
public class Category {

    public Category(String category_name, SiteUser siteUser){
        this.category_name = category_name;
        this.siteUser = siteUser;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    private String category_name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties({"category"})
    private List<LinkCollection> link_collection_list;

    //외래키라고함.
    @ManyToOne
    private SiteUser siteUser;

}
