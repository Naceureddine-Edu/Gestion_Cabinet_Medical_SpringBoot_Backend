package com.doclick.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
@Entity
public class Cabinet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public String Logo;
    @Column(nullable = false, columnDefinition = "TEXT")
    public String NomMedecin;
    @Column(nullable = false, columnDefinition = "TEXT")
    public String PrenomMedecin;
    @Column(nullable = false, columnDefinition = "TEXT")
    public String Specialite;
    @Column(nullable = false, columnDefinition = "TEXT")
    public String EmailCabinet;
    @Column(nullable = false, columnDefinition = "TEXT")
    public String TelephoneCabinet;
    @Column(nullable = false, columnDefinition = "TEXT")
    public String AdresseCabinet;
}
