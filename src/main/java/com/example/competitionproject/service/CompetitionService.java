package com.example.competitionproject.service;

import com.example.competitionproject.repository.ICompetitionRepository;
import com.example.competitionproject.repository.entity.Competition;
import com.example.competitionproject.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CompetitionService extends ServiceManager<Competition, Long> {
    private final ICompetitionRepository competitionRepository;

    public CompetitionService(ICompetitionRepository competitionRepository) {
        super(competitionRepository);
        this.competitionRepository = competitionRepository;
    }

}
