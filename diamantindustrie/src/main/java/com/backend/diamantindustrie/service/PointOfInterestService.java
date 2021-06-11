package com.backend.diamantindustrie.service;

import com.backend.diamantindustrie.domain.POI;
import com.backend.diamantindustrie.repository.PointOfInterestRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointOfInterestService {
    @Autowired
    private PointOfInterestRepository PoiRepo;

    public List<POI> FetchAllPointOfInterest(){
        return PoiRepo.findAll();
    }

}
