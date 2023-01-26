package com.kakaotrack.choco.linkupapi.category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findBySiteUser(Long id);

}
