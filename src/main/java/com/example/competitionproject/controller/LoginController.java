package com.example.competitionproject.controller;

import com.example.competitionproject.dto.request.DoLoginRequestDto;
import com.example.competitionproject.dto.request.RegisterRequestDto;
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

        @PostMapping("/register")
        public ModelAndView register(RegisterRequestDto dto) {
            boolean isRegister = userService.register(dto);
            ModelAndView model = new ModelAndView();
            if(isRegister) {
                model.setViewName("/redirect:/login");
            } else {
                model.addObject("error",
                        "kullanıcı adı daha önce alınmıştır");
                model.setViewName("register");
            }
            return model;
        }

        @PostMapping("/login")
        public ModelAndView login(DoLoginRequestDto doLoginDto){
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
