package com.example.competitionproject.controller;

import static com.example.competitionproject.constants.Api.*;

import com.example.competitionproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(USER)
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
}
