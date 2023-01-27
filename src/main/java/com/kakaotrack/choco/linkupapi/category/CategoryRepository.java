package com.kakaotrack.choco.linkupapi.category;

import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Type;
import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    //Category findBySiteUser(int id);


    List<Category> findBySiteUserId(int site_user_id);


}
