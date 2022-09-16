package com.example.competitionproject.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    @Column( name = "first_name", length = 300)
    String firstName;
    @Column( name = "last_name", length = 300)
    String lastName;
    String password;
    @Enumerated(EnumType.STRING)
    Role role;
    @OneToMany(mappedBy = "questionGenerator")
    List<Question> questionList;
    @ManyToOne
    @JoinColumn(name = "competition", referencedColumnName = "id")
    Competition competition;

}

