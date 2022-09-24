package com.example.competitionproject.service;

import com.example.competitionproject.repository.ICompetitionQuestionRepository;
import com.example.competitionproject.repository.entity.CompetitionQuestion;
import com.example.competitionproject.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CompetitionQuestionService extends ServiceManager<CompetitionQuestion, Long> {

    private final ICompetitionQuestionRepository competitionQuestionRepository;

    public CompetitionQuestionService(ICompetitionQuestionRepository competitionQuestionRepository) {
        super(competitionQuestionRepository);
        this.competitionQuestionRepository = competitionQuestionRepository;
    }
}
