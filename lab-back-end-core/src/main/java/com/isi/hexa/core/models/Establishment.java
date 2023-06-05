package com.isi.hexa.core.models;


import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
@Table(name = "establishments")
public class Establishment {

    @Id
    private Long id;

    private String name;



}
