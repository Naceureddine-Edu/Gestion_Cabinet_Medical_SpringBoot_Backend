package com.doclick.entities;


import com.doclick.enums.ConsultationEnum;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
@Entity
public class RendezVous
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    public String NomPatient;
    public String PrenomPatient;
    public String TelPatient;
    public String DescriptionPatient;
    public ConsultationEnum TypeConsultation;
    public Date DateConsultation;

    @ManyToOne
    public Patient patient;
}
