package com.example.competitionproject.service;

import com.example.competitionproject.repository.IScanningRepository;
import com.example.competitionproject.repository.entity.Scanning;
import com.example.competitionproject.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class ScanningService extends ServiceManager<Scanning, Long> {

    private final IScanningRepository scanningRepository;

    public ScanningService(IScanningRepository scanningRepository) {
        super(scanningRepository);
        this.scanningRepository = scanningRepository;
    }
}
