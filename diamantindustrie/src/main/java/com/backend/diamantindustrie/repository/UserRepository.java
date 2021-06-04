package com.backend.diamantindustrie.repository;

import com.backend.diamantindustrie.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

