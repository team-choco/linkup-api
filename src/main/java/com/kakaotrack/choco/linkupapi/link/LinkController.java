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
    public List<Link> getAll(){
        return linkService.getAll();
    }

    @PostMapping(value="/links")
    public Link createLink(String linkTitle, String linkContent, String linkAddress, SiteUser siteUser, LinkCollection linkCollection){
        Link link = linkService.createLink(linkTitle,linkContent,linkAddress,siteUser,linkCollection);
        return link;
    }

    @DeleteMapping(value = "/links/{id}")
    public void deleteLink(@PathVariable long id){ linkService.deleteLink(id);}

}
