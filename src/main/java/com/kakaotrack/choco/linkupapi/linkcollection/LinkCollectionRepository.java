package com.kakaotrack.choco.linkupapi.linkcollection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LinkCollectionRepository extends JpaRepository<LinkCollection, Long> {

    Optional<LinkCollection> findBySiteUser(Long id);

}