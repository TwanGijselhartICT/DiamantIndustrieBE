package com.backend.diamantindustrie.repository;

import com.backend.diamantindustrie.domain.POI;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointOfInterestRepository extends JpaRepository<POI, Integer> {
}
