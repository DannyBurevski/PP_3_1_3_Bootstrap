package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;
import java.util.List;
import java.util.Set;

public interface RoleDao {

    Role getRoleById(long id);

    Role getRoleByName(String name);

    void editRole(Role role);

    void addRole(Role role);

    List<Role> getListRole();

    Set<Role> getSetRoles(String[] roleNames);

}
