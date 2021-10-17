package com.doclick.servicesimplementation;

import com.doclick.entities.User;
import com.doclick.exceptions.ResourceNotFoundException;
import com.doclick.repositories.UserRepository;
import com.doclick.services.IUserService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IUserServiceImplementation implements IUserService
{
    //private final Logger log = LoggerFactory.getLogger(IUserServiceImplementation.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User userToCreate) {
        return userRepository.save(userToCreate);
    }

    @Override
    public User deleteUser(String login)
    {
        // check whether a employee exist in a DB or not
        User u = userRepository.findUserByLogin(login);
        userRepository.findById(u.getId()).orElseThrow(
                () -> new ResourceNotFoundException("User","id",u.getId()));
        return userRepository.deleteUserByLogin(login);
    }

    @Override
    public User updateUser(User userToUpdate)
    {
        // we need to check whether user with given id is exist in DB or not
        User existingUser = userRepository.findById(userToUpdate.getId()).orElseThrow(
                () -> new ResourceNotFoundException("User","id",userToUpdate.getId()));

        existingUser.setLogin(userToUpdate.login.toLowerCase());
        existingUser.setFirstName(userToUpdate.getFirstName());
        existingUser.setLastName(userToUpdate.getLastName());
        //existingUser.setUserName(userToUpdate.toLowerCase());
        existingUser.setEmail(userToUpdate.email);
        existingUser.setImageUrl(userToUpdate.imageUrl);
        existingUser.setActivated(userToUpdate.activated);
        existingUser.setLangKey(userToUpdate.langKey);
        // save existing employee to DB
        userRepository.save(existingUser);
        return existingUser;
    }

    @Override
    public User registerUser(User user, String password) {
        return null;
    }

    @Override
    public User updateUser(String firstName, String lastName, String langKey, String imageUrl) {
        return null;
    }

    @Override
    public User getUserWithUserRoles() {
        return null;
    }

    @Override
    public void changePassword(String currentPassword, String newPassword) {
        // TODO document why this method is empty
    }
}
