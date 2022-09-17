package com.example.competitionproject.service;

import com.example.competitionproject.repository.IWinnerRepository;
import com.example.competitionproject.repository.entity.Winner;
import com.example.competitionproject.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class WinnerService extends ServiceManager<Winner, Long> {

    private final IWinnerRepository winnerRepository;

    public WinnerService(IWinnerRepository winnerRepository) {
        super(winnerRepository);
        this.winnerRepository = winnerRepository;
    }
}
