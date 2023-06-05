package com.isi.hexa.core.service.user.admin;


import com.isi.hexa.core.models.User;
import com.isi.hexa.core.models.UserRole;
import com.isi.hexa.core.port.in.user.admin.AssignRoleToUserUseCase;
import com.isi.hexa.core.port.out.UserRepository;

public class AssignRoleToUserService implements AssignRoleToUserUseCase {

    private UserRepository userRepository;

    public AssignRoleToUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addRoleToUser(String email, UserRole userRole) {
        User user = userRepository.findByEmail(email);
        if(user!=null) throw new RuntimeException("this user already exist");

        user.getRoles().add(userRole);

        userRepository.save(user);

    }
}
