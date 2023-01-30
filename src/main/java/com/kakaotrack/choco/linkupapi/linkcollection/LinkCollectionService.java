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

    public List<LinkCollection> getBySiteUser(int id){
        return linkCollectionRepository.findBySiteUserId(id);
    }

    public LinkCollection getByLinkCollectionId(int link_collection_id){
        return linkCollectionRepository.findByLinkCollectionId(link_collection_id)
                .orElseThrow();
    }

    public LinkCollection createLinkCollection(String linkCollectionName, SiteUser siteUser, Category category){
        LinkCollection linkCollection = new LinkCollection();
        linkCollection.setLink_collection_name(linkCollectionName);
        linkCollection.setSiteUser(siteUser);
        linkCollection.setCategory(category);
        return linkCollectionRepository.save(linkCollection);
    }

    public void deleteLinkCollection(int link_collection_id){
        linkCollectionRepository.deleteById(link_collection_id);
    }


}
