package com.example.competitionproject.utility;

import com.example.competitionproject.repository.IUserRepository;
import com.example.competitionproject.repository.entity.User;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AdminImplementation {
    private final IUserRepository userRepository;

    public AdminImplementation(IUserRepository userRepository){
        this.userRepository = userRepository;
        Optional<User> user = this.userRepository.findByUserNameAndPassword("admin","admin");
        if(user.isEmpty())
            this.userRepository.save(User.builder()
                    .userName("admin")
                    .password("admin")
                    .fullName("Yönetici")
                    .build());
    }
}
