package net.jm.springmvc.service;

import net.jm.springmvc.entity.User;

import java.util.Set;

public interface UserService {

    Set<User> getUsers();

    void saveUser(User user);

    User getUser(long userId);

    void deleteUser(long userId);

}
