package com.example.competitionproject.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SaveQuestionRequestDto {

    private Long adminId;
    private String numberOfGroup;




}
