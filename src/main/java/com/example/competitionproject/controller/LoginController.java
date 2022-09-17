package com.example.competitionproject.controller;

import com.example.competitionproject.dto.request.DoLoginDto;
import com.example.competitionproject.repository.entity.User;
import com.example.competitionproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class LoginController {

        private final UserService userService;

        @GetMapping("/login")
        public ModelAndView login(){
            return new ModelAndView("login");
        }

        @GetMapping("/register")
        public ModelAndView register(){
            return new ModelAndView("register");
        }

        @PostMapping("/login")
        public ModelAndView login(DoLoginDto doLoginDto){
            Optional<User> userOptional =  userService.doLogin(doLoginDto);
            ModelAndView modelAndView = new ModelAndView();
            if(userOptional.isEmpty()){
                modelAndView.addObject("error","Kullanıcı adı veya şifre hatalı");
                modelAndView.setViewName("login");
            }else{
                modelAndView.addObject("user",userOptional.get());
                modelAndView.setViewName("user");
            }
            return modelAndView;
        }
}
