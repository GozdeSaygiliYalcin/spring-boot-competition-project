package com.example.competitionproject.service;

import com.example.competitionproject.dto.request.CreatingQuestionRequestDto;
import com.example.competitionproject.repository.IAnswerRepository;
import com.example.competitionproject.repository.IQuestionRepository;
import com.example.competitionproject.repository.entity.Question;
import com.example.competitionproject.utility.ServiceManager;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public class QuestionService extends ServiceManager<Question, Long> {

    private IQuestionRepository questionRepository;
    private AnswerService answerService;

    public QuestionService(IQuestionRepository questionRepository, AnswerService answerService) {
        super(questionRepository);
        this.questionRepository = questionRepository;
        this.answerService = answerService;
    }
    public void addQuestion(CreatingQuestionRequestDto dto) {
        /**
         * Soruyu kayıt ediyor.
         */
        Question question= save(Question.builder()
                .questionContent(dto.getQuestionRequestDto().getQuestionContent())
                .numberOfOption(dto.getQuestionRequestDto().getNumberOfOption())
                .duration(dto.getQuestionRequestDto().getDuration())
                .adminId(dto.getQuestionRequestDto().getAdminId())
                .build());
        /**
         * cevapları kayıt etmeniz gerekli.
         * 1. cevap kayıt edebnilmeniz için soru idsine ihtiyaç var
         * 2. bir sorunun en az 2 cevabı(şıkkı) olmalı
         */
        answerService.addAnswerToQuestion(dto.getAnswerRequestDtos(), question.getId());
    }

}
