package com.kakaotrack.choco.linkupapi.category;

import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollection;
import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollectionRepository;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private LinkCollectionRepository linkCollectionRepository;

    @GetMapping(value = "/categories")
    public List<Category> getAll() {return categoryService.getAll();}

    @PostMapping(value = "/categories")
    public Category createCategory(String categoryName, List<LinkCollection> linkCollectionList, SiteUser siteUser){
        Category category = categoryService.createCategory(categoryName, linkCollectionList, siteUser);
        return category;
    }

    @DeleteMapping(value = "/categories/{id}")
    public void deleteCategory(@PathVariable long id){ categoryService.deleteCategory(id);}

}
