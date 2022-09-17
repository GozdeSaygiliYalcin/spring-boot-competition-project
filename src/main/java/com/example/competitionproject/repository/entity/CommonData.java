package com.example.competitionproject.repository.entity;

import com.example.competitionproject.repository.eum.State;

import javax.persistence.Embeddable;

@Embeddable
public class CommonData {

    /**
     * ortak olması gereken
     * alanları bu classsta tanımlayarak
     * embeddable etiketiyle bunun gömülebilir olduğunu
     * belirtiyoruz
     */
//    State state;
    Long createdDate;
    Long updatedDate;



}
