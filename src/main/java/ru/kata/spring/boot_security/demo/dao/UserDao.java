package ru.kata.spring.boot_security.demo.dao;

import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;


@Repository
public interface UserDao {

    void deleteUserId(long id);

    User updateUser(User user);

    void addUser(User user);

    User getUserByEmail(String email);

    User getUserById(long id);

    List<User> listUser();

}