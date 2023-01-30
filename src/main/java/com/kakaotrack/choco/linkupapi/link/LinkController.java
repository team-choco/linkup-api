package com.kakaotrack.choco.linkupapi.link;

import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollection;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LinkController {
    @Autowired
    private LinkService linkService;

    @GetMapping(value="/links")
    public List<Link> getAll(@RequestParam(required = false, defaultValue = "0") int linkCollectionId){
        if(linkCollectionId==0){
            return linkService.getAll();
        }
        else{
            return linkService.getByLinkCollectionId(linkCollectionId);
        }
    }

    @GetMapping(value="/links/{id}")
    public List<Link> getBySiteUser(@PathVariable int id){
        return linkService.getBySiteUser(id);
    }

    @PostMapping(value="/links")
    public Link createLink(String linkTitle, String linkContent, String linkAddress, SiteUser siteUser, LinkCollection linkCollection){
        Link link = linkService.createLink(linkTitle,linkContent,linkAddress,siteUser,linkCollection);
        return link;
    }

    @DeleteMapping(value = "/links/{linkId}")
    public void deleteLink(@PathVariable int linkId){ linkService.deleteLink(linkId);}

}
