package com.example.competitionproject.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreatingQuestionRequestDto {

    private QuestionRequestDto questionRequestDto;
    private List<AnswerRequestDto> answerRequestDtos;
}
