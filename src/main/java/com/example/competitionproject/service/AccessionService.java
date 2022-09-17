package com.example.competitionproject.service;

import com.example.competitionproject.repository.IAccesionRepository;
import com.example.competitionproject.repository.entity.Accession;
import com.example.competitionproject.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class AccessionService extends ServiceManager<Accession, Long> {

    private final IAccesionRepository accesionRepository;

    public AccessionService(IAccesionRepository accesionRepository) {
        super(accesionRepository);
        this.accesionRepository = accesionRepository;
    }
}
