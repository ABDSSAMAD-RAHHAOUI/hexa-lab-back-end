package com.isi.hexa.core.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data @NoArgsConstructor
@AllArgsConstructor
public class Endowment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int endowmentId;
    private double budget;
    @OneToMany(mappedBy = "endowment")
    private List<EndowmentMember> endowments;


}
