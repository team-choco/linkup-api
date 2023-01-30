package com.kakaotrack.choco.linkupapi.category;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    public Category(String categoryName, SiteUser siteUser){
        this.categoryName = categoryName;
        this.siteUser = siteUser;
    }
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column(name="category_name")
    private String categoryName;

    @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties({"category"})
    @JsonIgnore
    private List<LinkCollection> linkCollectionList;

    //외래키라고함.
    @ManyToOne
    private SiteUser siteUser;

}
