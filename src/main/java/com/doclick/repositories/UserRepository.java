package com.doclick.repositories;

import com.doclick.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
    User deleteUserByLogin(String login);
    User findUserByRoles();
    User findUserByLogin(String login);
}
