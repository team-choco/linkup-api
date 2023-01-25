package com.kakaotrack.choco.linkupapi.category;

import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollection;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> getAll() {return categoryRepository.findAll();}

    public Category createCategory(String categoryName, List<LinkCollection> linkCollectionList, SiteUser siteUser){
        Category category = new Category();
        category.setCategory_name(categoryName);
        category.setLink_collection_list(linkCollectionList);
        category.setSiteUser(siteUser);
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id){categoryRepository.deleteById(id);}

}
