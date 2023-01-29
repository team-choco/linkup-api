package com.kakaotrack.choco.linkupapi.linkcollection;

import com.kakaotrack.choco.linkupapi.category.Category;
import com.kakaotrack.choco.linkupapi.link.Link;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LinkCollectionController {
    @Autowired
    private  LinkCollectionService linkCollectionService;

    @GetMapping(value = "/link-collections")
    public List<LinkCollection> getAll(){
        return linkCollectionService.getAll();
    }

    @GetMapping(value = "/link-collections/{id}")
    public List<LinkCollection> getBySiteUser(@PathVariable int id){
        return linkCollectionService.getBySiteUser(id);
    }

    @PostMapping(value = "/link-collections")
    public LinkCollection createLinkCollection(String linkCollectionName, SiteUser siteUser, Category category){
        LinkCollection linkCollection = linkCollectionService.createLinkCollection(linkCollectionName,siteUser,category);
        return linkCollection;
    }

    @DeleteMapping(value = "/link-collections/{link_collection_id}")
    public void deleteLinkCollections(@PathVariable int link_collection_id){ linkCollectionService.deleteLinkCollection(link_collection_id);}

}
