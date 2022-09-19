package com.example.competitionproject.repository.entity;

import com.example.competitionproject.repository.enums.State;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long questionId;
    @Column(length = 1000)
    String answer;
    boolean isTrue;
    /**
     *Bütün entitylerde olması gereken dataların olduğu ve
     * repository oluşturmamıza gerek olmayan sınıfı bütün entitylere
     * embedded etiketiyle ekliyoruz
     */
    @Embedded
    CommonData commonData;

    @Enumerated(EnumType.STRING)
    State state = State.APPROVED;
   // @OneToOne
   // @JoinColumn(name = "question", referencedColumnName = "id")
   // Question question;

//    @OneToOne (mappedBy = "answer")
//    Competition competition;


}
