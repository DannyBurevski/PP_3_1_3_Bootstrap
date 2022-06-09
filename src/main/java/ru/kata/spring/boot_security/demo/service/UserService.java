package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;


public interface UserService {

    void deleteUserId(long id);

    User updateUser(User user);

    void addUser(User user);

    User getUserByEmail(String email);

    User getUserById(long id);

    List<User> listUser();

}