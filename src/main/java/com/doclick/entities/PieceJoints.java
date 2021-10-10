package com.doclick.entities;


import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
@Entity
public class PieceJoints
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long Id;

    public String DocumentTitre;
    public String DocumentDescription;
    public String DocumentConsultation;

    @ManyToOne
    public Consultation consultation;
}
