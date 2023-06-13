package com.isi.hexa.core.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "establishments")
public class Establishment {

    @Id
    private Long id;

    private String name;



}
