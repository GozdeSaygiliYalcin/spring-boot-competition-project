package com.example.competitionproject.service;

import com.example.competitionproject.dto.request.DoLoginRequestDto;
import com.example.competitionproject.dto.request.RegisterRequestDto;
import com.example.competitionproject.mapper.IUserMapper;
import com.example.competitionproject.repository.IUserRepository;
import com.example.competitionproject.repository.entity.User;
import com.example.competitionproject.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends ServiceManager<User, Long> {

    private IUserRepository userRepository;

    IUserMapper userMapper = IUserMapper.INSTANCE;

    public UserService(IUserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }
    public Optional<User> doLogin(DoLoginRequestDto doLoginDto) {
        return userRepository.findByUserNameAndPassword(doLoginDto.getUserName(), doLoginDto.getPassword());
    }

    public boolean register(RegisterRequestDto dto) {
        Optional<User> user = userRepository.findByUserName(dto.getUserName());
        if(user.isPresent()) return false;
//        userRepository.save((User.builder()))
//                .fullName(dto.getFullName())
//                .userName(dto.getUserName())
//                .password(dto.getPassword())
//                .build();
        save(userMapper.INSTANCE.toUser(dto));
        return true;
    }

}
