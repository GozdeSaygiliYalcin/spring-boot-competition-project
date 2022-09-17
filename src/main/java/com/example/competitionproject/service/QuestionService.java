package com.example.competitionproject.service;

import com.example.competitionproject.repository.IQuestionRepository;
import com.example.competitionproject.repository.entity.Question;
import com.example.competitionproject.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class QuestionService extends ServiceManager<Question, Long> {

    private IQuestionRepository questionRepository;

    public QuestionService(IQuestionRepository questionRepository) {
        super(questionRepository);
        this.questionRepository = questionRepository;
    }
}
