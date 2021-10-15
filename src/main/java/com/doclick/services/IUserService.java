package com.doclick.services;


import com.doclick.entities.User;

import java.util.List;

public interface IUserService
{
    public List<User> getAllUsers();
    public User createUser(User userToCreate);
    public User deleteUser(String login);
    public User updateUser(User userToUpdate);
    public User registerUser(User user, String password);
    public User updateUser(String firstName, String lastName, String langKey, String imageUrl);
    public User getUserWithUserRoles();
    public void changePassword(String currentPassword, String newPassword);
}
