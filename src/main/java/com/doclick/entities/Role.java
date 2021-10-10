package com.doclick.entities;

import lombok.*;
import javax.persistence.*;
import java.util.*;


@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Role
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String roleName;

    @ManyToMany(mappedBy = "roles")
    public Collection<User> users;
}
