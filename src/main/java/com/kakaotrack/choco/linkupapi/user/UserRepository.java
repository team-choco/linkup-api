package com.kakaotrack.choco.linkupapi.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByusername(String username);
    /*
    이건 레포지토리라고 함.
     */
}
