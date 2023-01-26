package com.kakaotrack.choco.linkupapi.linkcollection;

import com.kakaotrack.choco.linkupapi.category.Category;
import com.kakaotrack.choco.linkupapi.link.Link;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class LinkCollectionService {
    private final LinkCollectionRepository linkCollectionRepository;

    public List<LinkCollection> getAll(){
        return linkCollectionRepository.findAll();
    }

    public Optional<LinkCollection> getBySiteUser(Long id){
        return linkCollectionRepository.findBySiteUser(id);
    }

    public LinkCollection createLinkCollection(String linkCollectionName, SiteUser siteUser, List<Link> listLink, Category category){
        LinkCollection linkCollection = new LinkCollection();
        linkCollection.setLink_list(listLink);
        linkCollection.setLink_collection_name(linkCollectionName);
        linkCollection.setSiteUser(siteUser);
        linkCollection.setCategory(category);
        return linkCollectionRepository.save(linkCollection);
    }

    public void deleteLinkCollection(Long id){
        linkCollectionRepository.deleteById(id);
    }


}
