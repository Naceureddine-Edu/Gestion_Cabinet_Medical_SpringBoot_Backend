package com.doclick.entities;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 33, nullable = false)
    public String userName;

    @Column(length = 233, nullable = false)
    private String password;

    /*
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    List<Role> roles; */

    @ManyToMany(fetch = FetchType.EAGER)
    public Collection<Role> roles;

    @Column(length = 33)
    public String firstName;

    @Column(length = 33)
    public String lastName;

    @Column(nullable = false)
    public Boolean activated;

    @Column( length = 256)
    public String imageUrl;


}
