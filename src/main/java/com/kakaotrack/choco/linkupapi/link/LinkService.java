package com.kakaotrack.choco.linkupapi.link;

import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollection;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LinkService {
    private final LinkRepository linkRepository;

    public List<Link> getAll(){
        return linkRepository.findAll();
    }

    public List<Link> getBySiteUser(int id){
        return linkRepository.findBySiteUserId(id);
    }

    public Link createLink(String linkTitle, String linkContent, String linkAddress, SiteUser siteUser, LinkCollection linkCollection){
        Link link = new Link();
        link.setLink_title(linkTitle);
        link.setLink_content(linkContent);
        link.setLink_address(linkAddress);
        link.setSiteUser(siteUser);
        link.setLink_collection(linkCollection);
        return linkRepository.save(link);
    }
    public void deleteLink(int link_id){
        linkRepository.deleteById(link_id);
    }
}
