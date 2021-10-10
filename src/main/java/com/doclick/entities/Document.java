package com.doclick.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
@Entity
public class Document
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    public String NomComplet;
    public Date DateF;
    public double MontantHT;
    public double MontantTVA;
    public double MontantTotal;

    @OneToMany(mappedBy="document")
    public Collection<Prestation> Prestations;
}
