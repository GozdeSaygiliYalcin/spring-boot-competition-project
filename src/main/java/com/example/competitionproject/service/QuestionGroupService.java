package com.example.competitionproject.service;

import com.example.competitionproject.repository.IQuestionGroupRepository;
import com.example.competitionproject.repository.entity.QuestionGroup;
import com.example.competitionproject.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class QuestionGroupService extends ServiceManager<QuestionGroup, Long> {

    private final IQuestionGroupRepository questionGroupRepository;

    public QuestionGroupService(IQuestionGroupRepository questionGroupRepository) {
        super(questionGroupRepository);
        this.questionGroupRepository = questionGroupRepository;
    }
}
