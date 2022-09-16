package com.example.competitionproject.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "competitions_table")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(mappedBy = "competition")
    List <User> userList;

  //  @OneToMany(mappedBy = )
  //  List<User> winnerList;

    @OneToMany (mappedBy = "question")
    List<Question> questionList;

    @OneToMany (mappedBy = "answer")
    List<Answer> answerList;

    @OneToOne
    @JoinColumn(name = "answer", referencedColumnName = "answer")
    Answer answer;


}
