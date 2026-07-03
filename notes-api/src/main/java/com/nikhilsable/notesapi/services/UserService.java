package com.nikhilsable.notesapi.services;

import com.nikhilsable.notesapi.dtos.UserDTO;
import com.nikhilsable.notesapi.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);
}
