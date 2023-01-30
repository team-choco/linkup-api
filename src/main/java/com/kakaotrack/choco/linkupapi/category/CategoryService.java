package com.kakaotrack.choco.linkupapi.category;

import com.kakaotrack.choco.linkupapi.user.SiteUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> getAll() {return categoryRepository.findAll();}

    public List<Category> getBySiteUser(int id){
        return categoryRepository.findBySiteUserId(id);
    }

    public Category createCategory(String categoryName, SiteUser siteUser){
        Category category = new Category(categoryName, siteUser);
        return categoryRepository.save(category);
    }

    public void deleteByCategoryId(int category_id){categoryRepository.deleteById(category_id);}

}
