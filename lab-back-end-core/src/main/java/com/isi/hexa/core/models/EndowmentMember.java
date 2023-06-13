package com.isi.hexa.core.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EndowmentMember {
    @EmbeddedId
    private EndowmentMemberKey key;
    @ManyToOne
    @MapsId("personnelId")
    @JoinColumn(name = "member_id")
    private User member;
    @ManyToOne
    @MapsId("dotationId")
    @JoinColumn(name = "endowment_id")
    private Endowment endowment;

    private double priceEndowment;
}
