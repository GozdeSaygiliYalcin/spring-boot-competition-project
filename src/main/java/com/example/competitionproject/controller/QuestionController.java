package com.example.competitionproject.controller;

import com.example.competitionproject.dto.request.CreatingQuestionRequestDto;
import com.example.competitionproject.dto.request.QuestionRequestDto;
import com.example.competitionproject.repository.entity.Question;
import com.example.competitionproject.service.AnswerService;
import com.example.competitionproject.service.QuestionService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



import static com.example.competitionproject.constants.Api.*;

@Controller
@RequestMapping(QUESTION)
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @CrossOrigin //security kısmında detaylı değineceğiz
    @GetMapping("/addquestion")
    public ModelAndView addQuestion() {
        ModelAndView model = new ModelAndView();
        model.addObject("userId", 1); //?
        model.setViewName("creatingquestion");
        return model;
    }

    @CrossOrigin
    @PostMapping(value = "/addquestion")
    public ModelAndView addQuestion(@RequestBody CreatingQuestionRequestDto dto) {
        questionService.addQuestion(dto);
        return new ModelAndView("redirect:soruekle");
    }

}
