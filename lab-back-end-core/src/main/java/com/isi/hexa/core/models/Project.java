package com.isi.hexa.core.models;



import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "projects")
public class Project {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;

    @ManyToMany
    @JoinTable(
            name = "user_project",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> membres = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "manager_id", nullable = false)
    private User manager;

    @ManyToOne
    private Laboratory laboratory;

    @OneToMany(mappedBy = "project")
    private List<EndowmentProject> endowments;

}

