package com.example.competitionproject.repository.entity;

import com.example.competitionproject.repository.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "competition_questions_table")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CompetitionQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long questionId;
    Long competitionId;
    int duration;
    int numberOfQueue;
    @Enumerated(EnumType.STRING)
    State state = State.APPROVED;
    @Embedded
    CommonData commonData;
    @Transient
    List<User> answeredCorrectly;
    @Transient
    List<User> answeredWrongly;
}
