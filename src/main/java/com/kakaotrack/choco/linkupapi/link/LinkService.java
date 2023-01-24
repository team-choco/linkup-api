package com.kakaotrack.choco.linkupapi.link;

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

    public Link createLink(String linkTitle, String linkContent, String linkAddress, SiteUser siteUser){
        Link link = new Link();
        link.setLink_title(linkTitle);
        link.setLink_content(linkContent);
        link.setLink_address(linkAddress);
        link.setSite_user(siteUser);
        return linkRepository.save(link);
    }
    public void deleteLink(Long id){
        linkRepository.deleteById(id);
    }
}
