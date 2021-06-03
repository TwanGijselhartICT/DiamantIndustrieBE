package com.backend.diamantindustrie.repository;

import com.backend.diamantindustrie.domain.PointOfInterest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointOfInterestRepository extends JpaRepository<PointOfInterest, Integer> {
}
