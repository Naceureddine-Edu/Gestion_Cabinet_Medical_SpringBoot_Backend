package com.doclick.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;


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
