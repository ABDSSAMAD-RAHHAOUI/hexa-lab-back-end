package com.isi.hexa.core.models;



import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "ExpressionOfNeeds")
public class Eon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private EonType type;
    private String title;
    private String description;
    private boolean validByDirector;
    private Date request_Date;
    private Date date_of_validation_by_Director;
    private Date effective_date;
    private double staff_amount;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private User member;


}
