package com.isi.hexa.api.security.service;


import com.isi.hexa.core.models.User;
import com.isi.hexa.core.models.UserRole;

public interface UserService {
    User addNewUser(String username , String password, String email);
    void deleteRoleFromUser(String username , UserRole userRole);

    User loadUserByEmail(String email);
}
