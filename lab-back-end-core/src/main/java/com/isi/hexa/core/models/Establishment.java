package com.isi.hexa.core.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "establishments")
public class Establishment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;



}
