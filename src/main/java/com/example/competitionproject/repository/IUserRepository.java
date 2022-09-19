package com.example.competitionproject.repository;

import com.example.competitionproject.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserNameAndPassword(String userName, String password);

    /**
     * Optional ile sonuç dönmek istiyorken
     * tek bir sonuç yerine veri tabanından bir liste dönerse
     * program exception atarak akışı durduracaktır
     * Tek kayıt döneceğinden emin değilsek optionalı dikkatli kullanmalıyız
     */
    Optional<User>findByUserName(String userName);
}
