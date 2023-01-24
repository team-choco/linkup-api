package com.kakaotrack.choco.linkupapi.linkcollection;

import com.kakaotrack.choco.linkupapi.category.Category;
import com.kakaotrack.choco.linkupapi.link.Link;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinkCollectionController {
    @Autowired
    private  LinkCollectionService linkCollectionService;

    @GetMapping(value = "/link-collections")
    public List<LinkCollection> getAll(){
        return linkCollectionService.getAll();
    }

    @PostMapping(value = "/link-collections")
    public LinkCollection createLinkCollection(String linkCollectionName, SiteUser siteUser, List<Link> listLink, Category category){
        LinkCollection linkCollection = linkCollectionService.createLinkCollection(linkCollectionName,siteUser,listLink,category);
        return linkCollection;
    }
}
