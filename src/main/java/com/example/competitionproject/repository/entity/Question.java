package com.example.competitionproject.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "questions_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String question;
    @OneToOne(mappedBy = "question")
    Answer answer;

   // List<Answer> answerList;
    @ManyToOne
    @JoinColumn(name = "question_generator", referencedColumnName = "id")
    User questionGenerator;

    @ManyToOne
    @JoinColumn(name = "competition", referencedColumnName = "id")
    Competition competition;

}
