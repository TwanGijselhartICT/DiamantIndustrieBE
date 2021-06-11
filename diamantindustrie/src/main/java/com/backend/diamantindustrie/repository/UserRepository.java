package com.backend.diamantindustrie.repository;

import com.backend.diamantindustrie.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {


    @Query("select username from user where username = ?1 and age = ?2")
    String findByUserNameAndAge(String Username, int age);

    @Query("SELECT CollectedDiamonds FROM user where username = ?1 and age = ?2")
    String findDiamonds (String Username, int age);

}

