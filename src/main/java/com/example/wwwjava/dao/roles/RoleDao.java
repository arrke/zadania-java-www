package com.example.wwwjava.dao.roles;

import com.example.wwwjava.models.Role;

import java.util.List;
import java.util.Optional;

public interface RoleDao {
    Optional<Role> getUserById(Long id);
    List<Role> getAllUsers();

    Role saveUser(Role role);

    void deleteUserById(Long id);
    Role findRoleByName(String roleName);

}