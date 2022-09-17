package com.example.competitionproject.service;

import com.example.competitionproject.dto.request.DoLoginDto;
import com.example.competitionproject.repository.IUserRepository;
import com.example.competitionproject.repository.entity.User;
import com.example.competitionproject.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends ServiceManager<User, Long> {

    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }
    public Optional<User> doLogin(DoLoginDto doLoginDto) {
        return userRepository.findByUserNameAndPassword(doLoginDto.getUserName(), doLoginDto.getPassword());
    }

}
