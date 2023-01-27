package com.kakaotrack.choco.linkupapi.category;

import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollection;
import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollectionRepository;
import com.kakaotrack.choco.linkupapi.user.SiteUser;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping(value = "/categories")
    public List<Category> getAll() {return categoryService.getAll();}

    @GetMapping(value = "/categories/{id}")
    public List<Category> getBySiteUser(@PathVariable int id) {return categoryService.getBySiteUser(id);}

    @PostMapping(value = "/categories")
    public Category createCategory(String categoryName, SiteUser siteUser){
        Category category = categoryService.createCategory(categoryName, siteUser);
        return category;
    }

    @DeleteMapping(value = "/categories/{category_id}")
    public void deleteCategory(@PathVariable int category_id){ categoryService.deleteByCategoryId(category_id);}

}
