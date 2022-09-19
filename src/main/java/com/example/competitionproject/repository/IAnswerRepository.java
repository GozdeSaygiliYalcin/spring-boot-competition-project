package com.example.competitionproject.repository;

import com.example.competitionproject.repository.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnswerRepository extends JpaRepository<Answer, Long> {


}
