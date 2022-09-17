package com.example.competitionproject.repository;

import com.example.competitionproject.repository.entity.Scanning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IScanningRepository extends JpaRepository<Scanning, Long> {
}
