package com.example.testMedicine.Entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Specialization extends DataBaseObject{

    @Column(nullable = false)
    private String name;

}
