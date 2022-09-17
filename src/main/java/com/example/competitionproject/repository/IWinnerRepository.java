package com.example.competitionproject.repository;

import com.example.competitionproject.repository.entity.Winner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWinnerRepository extends JpaRepository<Winner, Long> {
}
