package com.kakaotrack.choco.linkupapi.link;

import com.kakaotrack.choco.linkupapi.linkcollection.LinkCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinkRepository extends JpaRepository<Link, Integer> {

    List<Link> findBySiteUserId(int siteUserId);

    List<Link> findAllByLinkCollection(LinkCollection linkCollection);
}
