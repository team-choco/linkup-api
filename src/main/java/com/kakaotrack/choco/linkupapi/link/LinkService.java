package com.kakaotrack.choco.linkupapi.link;

import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollection;
import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollectionRepository;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LinkService {
    private final LinkRepository linkRepository;
    private final LinkCollectionRepository linkCollectionRepository;

    public List<Link> getAll(){
        return linkRepository.findAll();
    }

    public List<Link> getBySiteUser(int id){
        return linkRepository.findBySiteUserId(id);
    }

    public Link createLink(String linkTitle, String linkContent, String linkAddress, SiteUser siteUser, LinkCollection linkCollection){
        Link link = new Link();
        link.setLinkTitle(linkTitle);
        link.setLinkContent(linkContent);
        link.setLinkAddress(linkAddress);
        link.setSiteUser(siteUser);
        link.setLinkCollection(linkCollection);
        return linkRepository.save(link);
    }
    public void deleteLink(int linkId){
        linkRepository.deleteById(linkId);
    }

    public List<Link> getByLinkCollectionId(int linkCollectionId) {
        LinkCollection linkCollection = linkCollectionRepository.findByLinkCollectionId(linkCollectionId)
                .orElseThrow();
        return linkRepository.findAllByLinkCollection(linkCollection);
    }
}
