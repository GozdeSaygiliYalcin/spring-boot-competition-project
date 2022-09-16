package com.example.competitionproject.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "rules_table")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Rule {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    Role role;
}
