package com.kakaotrack.choco.linkupapi.linkcollection;

import com.kakaotrack.choco.linkupapi.category.Category;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LinkCollectionService {
    private final LinkCollectionRepository linkCollectionRepository;

    public List<LinkCollection> getAll(){
        return linkCollectionRepository.findAll();
    }


    public LinkCollection getByLinkCollectionId(int linkCollectionId){
        return linkCollectionRepository.findByLinkCollectionId(linkCollectionId);
    }

    public LinkCollection createLinkCollection(String linkCollectionName, SiteUser siteUser, Category category){
        LinkCollection linkCollection = new LinkCollection();
        linkCollection.setLinkCollectionName(linkCollectionName);
        linkCollection.setSiteUser(siteUser);
        linkCollection.setCategory(category);
        return linkCollectionRepository.save(linkCollection);
    }

    public void deleteLinkCollection(int linkCollectionId){
        linkCollectionRepository.deleteById(linkCollectionId);
    }


}
