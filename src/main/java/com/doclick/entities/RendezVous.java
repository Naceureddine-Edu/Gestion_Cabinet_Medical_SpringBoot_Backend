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

    public String nomPatient;
    public String prenomPatient;
    public String telPatient;
    public String descriptionPatient;
    public ConsultationEnum typeConsultation;
    public Date dateConsultation;

    @ManyToOne
    public Patient patient;
}
