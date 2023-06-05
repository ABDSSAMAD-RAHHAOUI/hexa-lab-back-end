package com.isi.hexa.core.models;

import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "laboratories")
@Data
public class Laboratory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Date director_date;
    private Date director_date_end;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "establishment_id", nullable = false)
    private Establishment establishment;


    @OneToOne
    @JoinColumn(name = "director_id", nullable = false)
    private User director;




}
