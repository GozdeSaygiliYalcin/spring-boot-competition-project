package com.example.competitionproject.service;

import com.example.competitionproject.repository.IAnswerRepository;
import com.example.competitionproject.repository.entity.Answer;
import com.example.competitionproject.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class AnswerService extends ServiceManager<Answer, Long> {

    private final IAnswerRepository answerRepository;

    public AnswerService(IAnswerRepository answerRepository) {
        super(answerRepository);
        this.answerRepository = answerRepository;
    }

}
