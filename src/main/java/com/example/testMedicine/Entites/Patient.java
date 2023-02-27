package com.example.testMedicine.Entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Getter
@Setter
public class Patient extends DataBaseObject{

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String secondName;

    @Column
    private String lastName;

    @Column
    @Temporal(TemporalType.DATE)
    private Date birthDate;

}
