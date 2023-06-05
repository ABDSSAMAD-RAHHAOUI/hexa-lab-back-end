package com.isi.hexa.core.port.in.user.admin;


import com.isi.hexa.core.models.UserRole;

public interface AssignRoleToUserUseCase {
    void addRoleToUser(String email , UserRole userRole);

}
