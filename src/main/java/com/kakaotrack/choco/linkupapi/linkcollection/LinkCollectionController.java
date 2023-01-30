package com.kakaotrack.choco.linkupapi.linkcollection;

import com.kakaotrack.choco.linkupapi.category.Category;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LinkCollectionController {
    @Autowired
    private  LinkCollectionService linkCollectionService;

    @GetMapping(value = "/link-collections")
    public List<LinkCollection> getAll(){
        return linkCollectionService.getAll();
    }

    @GetMapping(value="/link-collections/{linkCollectionId}")
    public LinkCollection getByLinkCollectionId(@PathVariable int linkCollectionId){
        return linkCollectionService.getByLinkCollectionId(linkCollectionId);
    }

    @PostMapping(value = "/link-collections")
    public LinkCollection createLinkCollection(String linkCollectionName, SiteUser siteUser, Category category){
        LinkCollection linkCollection = linkCollectionService.createLinkCollection(linkCollectionName,siteUser,category);
        return linkCollection;
    }

    @DeleteMapping(value = "/link-collections/{linkCollectionId}")
    public void deleteLinkCollections(@PathVariable int linkCollectionId){ linkCollectionService.deleteLinkCollection(linkCollectionId);}

}
