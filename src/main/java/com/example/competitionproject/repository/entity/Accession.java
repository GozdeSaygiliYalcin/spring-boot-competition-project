package com.example.competitionproject.repository.entity;

import com.example.competitionproject.repository.eum.AccessionType;
import com.example.competitionproject.repository.eum.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "accessions_table")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Accession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long userId;
    Long competitionId;
    Long date;
    @Enumerated(EnumType.STRING)
    AccessionType accessionType = AccessionType.NOTAPPROVED;
    @Embedded
    CommonData commonData;
}
