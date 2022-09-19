package com.example.competitionproject.repository.entity;

import com.example.competitionproject.repository.enums.CompetitionState;
import com.example.competitionproject.repository.enums.State;
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
    Long competiterId;
    String competitionTitle;
    String competitionDefinition;
    String picture;
    int numberOfWinner;

    @Enumerated(EnumType.STRING)
    CompetitionState competitionState = CompetitionState.ACTIVE_SESSION;

    @Enumerated(EnumType.STRING)
    State state = State.AWAITINGAPPROVAL;

    @Embedded
    CommonData commonData;

//    @OneToMany(mappedBy = "competition")
    @Transient
    List <User> userList;

//    @OneToMany (mappedBy = "question")
    @Transient
    List<Question> questionList;

//    @OneToMany (mappedBy = "answer")
//    List<Answer> answerList;

//    @OneToOne
//    @JoinColumn(name = "answer", referencedColumnName = "answer")
//    Answer answer;

    //  @OneToMany(mappedBy = )
    //  List<User> winnerList;

}
