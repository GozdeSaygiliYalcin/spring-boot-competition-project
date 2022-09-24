package com.example.competitionproject.repository.entity;

import com.example.competitionproject.repository.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    String questionContent;
    int duration;
    int numberOfOption;
    String numberOfGroup;
    @Enumerated(EnumType.STRING)
    @Builder.Default
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
