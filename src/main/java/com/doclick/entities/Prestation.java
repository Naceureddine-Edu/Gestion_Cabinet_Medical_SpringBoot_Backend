package com.doclick.entities;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
@Entity
public class Prestation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    public String LibPrestation;
    public Double PrixPrestation;
    public Integer QuantitePrestation;
    public Double PrixTotal;

    @ManyToOne
    public Document document;
}
