package com.example.testMedicine.Entites;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "doctor")
public class Doctor extends DataBaseObject {

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String secondName;

    @Column
    private String lastName;

    @Column
    private UUID uuid;

    @OneToMany
    private List<Specialization> specialization = new ArrayList<>();

}
