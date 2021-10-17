package com.doclick.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 33, nullable = false)
    public String login;

    @Column(length = 233, nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    public Collection<Role> roles;

    @Column(length = 33)
    public String firstName;

    @Column(length = 33)
    public String lastName;

    @Column(length = 6)
    public String langKey;

    @Column(nullable = false)
    public Boolean activated;

    @Column( length = 256)
    public String imageUrl;

    @Column(length = 33, unique = true)
    public String email;



    /*
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    List<Role> roles; */
}
