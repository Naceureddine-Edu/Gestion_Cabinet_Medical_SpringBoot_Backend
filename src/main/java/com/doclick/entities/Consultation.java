package com.doclick.entities;

import lombok.*;
import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
@Entity
public class Consultation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public String DateConsultation;
    public String MotifConsultation;
    public String DescriptionConsultation;

    @ManyToOne
    public Patient patient;

    @OneToMany(mappedBy="consultation")
    public Collection<PieceJoints> PieceJoints;


}
