package com.persistent.userauthentication.repository;

import com.persistent.userauthentication.model.AuthenticationRequest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<AuthenticationRequest,Integer> {

    @Query("SELECT ud FROM user ud WHERE ud.username = ?1")
    public AuthenticationRequest getUserByUsername(String username);
}
