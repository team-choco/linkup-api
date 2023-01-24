//package com.kakaotrack.choco.linkupapi.category;
//
//import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollection;
//import com.kakaotrack.choco.linkupapi.user.SiteUser;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.List;
//
//@Getter
//@Setter
//@Entity
//public class Category {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    //고유한 개인 아이디를 받아서 개인이 만든 카테고리를 보려고함.
//    private Long id;
//
//    //개인이 만든 카테고리 이름은 고유하게 보유함
//    private String categoryName;
//
//    //이게 뭐냐면 일대다 개인이 여러 개의 카테고리를 생성 가능하니깐
//    @OneToMany(mappedBy = "linkCollection", cascade = CascadeType.REMOVE)
//    private List<LinkCollection> linkCollectionList;
//
//    //외래키라고함.
//    @ManyToOne
//    private SiteUser siteUser;
//}
