package com.isi.hexa.core.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    @Column(unique = true)
    private String email;
    private String password;
    private int anneeAffectation;


    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Set<UserRole> roles = new HashSet<>();

    @ManyToMany(mappedBy = "membres")
    private Set<Project> projects = new HashSet<>();

    @OneToOne(mappedBy = "director")
    private Laboratory lab;

    @ManyToOne
    @JoinColumn(name = "laboratory_id")
    private Laboratory laboratory;

    @OneToMany(mappedBy = "member")
    private List<EndowmentMember> endowments;

}
