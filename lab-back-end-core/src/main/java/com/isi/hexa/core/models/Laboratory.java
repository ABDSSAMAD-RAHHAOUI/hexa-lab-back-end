package com.isi.hexa.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @OneToMany(mappedBy = "laboratory")
    private List<Project> projectList;


    /*public double calculerDotationLabo() {
        double dotationLabo = 0;
        for (User membre : membres) {
            if (membre.getEndowment().getType().equals(EndowmentType.UCA)) {
                dotationLabo += membre.getEndowment().getMontant();
            }
        }
        return dotationLabo;
    }*/

}
