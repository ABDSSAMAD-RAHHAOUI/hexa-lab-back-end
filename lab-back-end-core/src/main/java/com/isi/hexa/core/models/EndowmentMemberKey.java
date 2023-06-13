package com.isi.hexa.core.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EndowmentMemberKey implements Serializable {
    @Column(name = "member_id")
    private int memId;
    @Column(name = "endowment_id")
    private int endoId;
}
