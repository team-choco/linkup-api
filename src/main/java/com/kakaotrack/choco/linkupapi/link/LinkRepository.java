package com.kakaotrack.choco.linkupapi.link;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {

    Link findBySiteUser(Long id);

}
