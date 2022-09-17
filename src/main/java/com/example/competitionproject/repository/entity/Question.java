package com.example.competitionproject.repository.entity;

import com.example.competitionproject.repository.eum.State;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long adminId;
    @Column(length = 1000)
    String question;
    Long duration;
    int numberOfOption;
    String numberOfGroup;
    @Enumerated(EnumType.STRING)
    State state = State.AWAITINGAPPROVAL;
    @Embedded
    CommonData commonData;

//    @OneToOne(mappedBy = "question")
//    Answer correctAnswer;
//
//   // List<Answer> answerList;
//    @ManyToOne
//    @JoinColumn(name = "question_generator", referencedColumnName = "id")
//    User questionGenerator;
//
//    @ManyToOne
//    @JoinColumn(name = "competition", referencedColumnName = "id")
//    Competition competition;



}
