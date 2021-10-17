package com.doclick.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
@Entity
public class Patient
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public String Nom;
    public String Prenom;
    public String Tel;
    public String DateNaissance;
    public String Cin;
    public String Profession;
    public String SituationMatrimoniale;
    public String Adresse;
    public String Ville;
    public Boolean Assurance;
    public String LibelleAssurance;
    public String Correspendance;
    public String Antecedants;

    @OneToMany(mappedBy="patient")
    public Collection<Consultation> Consultations;
    @OneToMany(mappedBy="patient")
    public Collection<RendezVous> RendezVous;
}
