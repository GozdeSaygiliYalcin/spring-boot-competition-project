package com.example.competitionproject.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "answers_table")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String answer;
    @OneToOne
    @JoinColumn(name = "question", referencedColumnName = "id")
    Question question;

    @OneToOne (mappedBy = "answer")
    Competition competition;
}
