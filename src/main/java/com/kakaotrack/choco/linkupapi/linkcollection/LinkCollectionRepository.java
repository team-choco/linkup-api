package com.kakaotrack.choco.linkupapi.linkcollection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkCollectionRepository extends JpaRepository<LinkCollection, Long> {
}
