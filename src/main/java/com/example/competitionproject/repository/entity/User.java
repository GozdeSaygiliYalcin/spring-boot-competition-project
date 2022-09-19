package com.example.competitionproject.repository.entity;

import com.example.competitionproject.repository.enums.Role;
import com.example.competitionproject.repository.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "users_table")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column( name = "full_name", length = 300)
    String fullName;
    @Column( name = "user_name", length = 300)
    String userName;
    String password;
    @Enumerated(EnumType.STRING)
    Role role = Role.COMPETITOR;
    @Enumerated(EnumType.STRING)
    State state = State.APPROVED;
    @Embedded
    CommonData commonData;

//    @OneToMany(mappedBy = "questionGenerator")
//    List<Question> questionList;
//    @ManyToOne
//    @JoinColumn(name = "competition", referencedColumnName = "id")
//    Competition competition;



}

