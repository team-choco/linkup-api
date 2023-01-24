package com.kakaotrack.choco.linkupapi.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class SiteUser {
    public SiteUser(){

    }
    public SiteUser(String username, String email){
        this.username=username;
        this.email=email;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
}
