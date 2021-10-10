package com.doclick.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Data
@AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
@Entity
public class Ordonance
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    public Date DateOrodnance;
    public String Medicament;
    public String Posologie;
    public String DescriptionOrdonance;

    @ManyToOne
    public Consultation consultation;
}
