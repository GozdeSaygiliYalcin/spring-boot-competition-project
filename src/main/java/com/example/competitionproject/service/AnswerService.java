package com.example.competitionproject.service;

import com.example.competitionproject.dto.request.AnswerRequestDto;
import com.example.competitionproject.repository.IAnswerRepository;
import com.example.competitionproject.repository.entity.Answer;
import com.example.competitionproject.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService extends ServiceManager<Answer, Long> {

    private final IAnswerRepository answerRepository;

    public AnswerService(IAnswerRepository answerRepository) {
        super(answerRepository);
        this.answerRepository = answerRepository;
    }

    /**
     *
     * bu metotun çalışma mantığı?
     *
     */
    public void addAnswerToQuestion(List<AnswerRequestDto> dto, Long questionId){
        dto.forEach(answer->{
                save(Answer.builder()
                    .id(questionId)
                    .isTrue(answer.isTrue())
                    .answer(answer.getAnswerContent())
                    .build());
        });
    }

}
